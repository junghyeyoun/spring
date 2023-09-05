package pack.guest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Annotation 연습용
		ApplicationContext context = new ClassPathXmlApplicationContext("annobank.xml");
		
		Gogek 길동 = (Gogek)context.getBean("gogek");
		길동.selectBank("신한");
		길동.playInputMoney(2000);
		길동.playoutputMoney(1000);
		System.out.println("길동 - ");
		길동.showMoney();
		
		Gogek 국인 = (Gogek)context.getBean("gogek");
		국인.selectBank("하나");
		국인.playInputMoney(2000);
		국인.playoutputMoney(1000);
		System.out.println("국인 - ");
		국인.showMoney();
		
		Gogek 효림 = (Gogek)context.getBean("gogek");
		효림.selectBank("하나");
		효림.playInputMoney(5000);
		효림.playoutputMoney(1000);
		System.out.println("효림 - ");
		효림.showMoney();
		
		System.out.println("주소 확인 : "+길동+" "+국인+" "+효림);
		// 길동 - pack.guest.Gogek@53fe15ff 국인 - pack.guest.Gogek@53fe15ff 효림 - pack.guest.Gogek@53fe15ff : 싱글톤이기 때문에
		// 길동은 다른 객체를 사용해서 괜찮지만 국인, 효림은 같은 객체를 쓰기 때문에 잔고가 합쳐져 나옴
		// @Scope("prototype")을 써주면 객체가 따로 만들어지기 때문에 주소도 달라지고 잔고 오류 없음 
	}

}
 