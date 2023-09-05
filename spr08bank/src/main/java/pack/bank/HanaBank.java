package pack.bank;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hana")
@Scope("prototype")
public class HanaBank implements Bank{
	private int money = 1000; // 계좌를 만들면 축하금으로 1000원 준다고 가정
	// 메소드 이름은 같으나 내부적인 시스템은 다를 수 있음. 
	@Override
	public void inputMoney(int money) {
		this.money = this.money + money;
	}
	
	@Override
	public void outputMoney(int money) {
		int imsi = money;
		this.money = this.money - imsi;
	}
	
	@Override
	public int getMoney() { 
		int hbuffer = money;
		return hbuffer;
	}
}
