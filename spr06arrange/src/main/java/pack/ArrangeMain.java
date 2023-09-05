package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrangeMain {

	public static void main(String[] args) {
		// spring이 생성한 객체를 호출 후 실행
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:arrange.xml");
		
		/*
		// singleton 확인 --------------------------
		MessageImpl impl1 = new MessageImpl("tom");
		impl1.sayHi();
		
		MessageImpl impl2 = new MessageImpl("oscar");
		impl2.sayHi();
		
		System.out.println("객체 주소 : "+impl1.toString() + " "+impl2); // toString 써도되고 안써도 됨
		// 객체 주소 : pack.MessageImpl@7e6f74c pack.MessageImpl@dd05255 객체가 별도로 생성 : singleton이 아니라는 얘기
		
		System.out.println("---------");
		
		MessageImpl spr_impl1 = (MessageImpl)context.getBean("msgImpl");
		spr_impl1.sayHi();
		
		MessageImpl spr_impl2 = (MessageImpl)context.getBean("msgImpl");
		spr_impl2.sayHi();
		
		System.out.println("객체 주소 : "+spr_impl1 + " "+spr_impl2);
		// 객체 주소(스프링) : pack.MessageImpl@6a78afa0 pack.MessageImpl@6a78afa0 두 변수의 주소가 동일 : singleton이라는 얘기
		// -----------------------------------------
		*/
		
		System.out.println("다형성 캐스팅 관련");
		MessageImpl spr_impl3 = (MessageImpl)context.getBean("msgImpl");
		spr_impl3.sayHi();
		System.err.println(); 
		// MessageImpl의 super 클래스(Interface)를 사용
		MessageInter inter1 = (MessageInter)context.getBean("msgImpl");
		inter1.sayHi();
		MessageInter inter2 = (MessageImpl)context.getBean("msgImpl");
		inter2.sayHi();
	}

}
