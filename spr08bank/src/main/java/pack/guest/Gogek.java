package pack.guest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pack.bank.Bank;
import pack.bank.HanaBank;
import pack.bank.SinhanBank;

@Service
@ComponentScan("pack.bank")
@Scope("prototype")
public class Gogek {
	private Bank bank;
	
	@Autowired
	private SinhanBank sinhanBank;
	
	@Resource(name="hana")
	private HanaBank hanaBank;
	
	public void selectBank(String sel) {
		if(sel.equals("신한")) {
			bank = sinhanBank;
		} else if (sel.equals("하나")) {
			bank = hanaBank;
		}
	}
	
	public void playInputMoney(int money) {
		// ...
		bank.inputMoney(money);
	}
	
	public void playoutputMoney(int money) {
		// ...
		bank.outputMoney(money);
	}
	
	private String msg;
	
	@PostConstruct // 생성자 이후에 자동 수행
	public void init() {
		msg = "계좌 잔고 : ";
	}
	
	@PreDestroy // 서비스 클래스가 종료되기 전에 수행. 마무리 담당
	public void end() {
		if(sinhanBank != null) sinhanBank = null;
		if(hanaBank != null) hanaBank = null;
	}
	
	public void showMoney() {
		// System.out.println("고객님의 계좌 잔고는 "+bank.getMoney());
		 System.out.println(msg+bank.getMoney());
	}
}
