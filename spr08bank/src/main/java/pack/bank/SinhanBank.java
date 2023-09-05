package pack.bank;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SinhanBank implements Bank{
	private int money = 5000; // 계좌를 만들면 축하금으로 5000원 준다고 가정
	@Override
	public void inputMoney(int money) {
		this.money += money;
	}
	
	@Override
	public void outputMoney(int money) {
		this.money -= money;
	}
	
	@Override
	public int getMoney() { 
		return money;
	}
}
