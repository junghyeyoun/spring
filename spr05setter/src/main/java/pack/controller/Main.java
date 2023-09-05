package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myinit.xml");
		
		MyProcess myProcess = (MyProcess)context.getBean("my");
		// System.out.println(myProcess.displayData());
		// System.out.println(myProcess.toString()); // 주소를 출력 .toString도 마찬가지이지만 MyProcess에서 오버라이딩해서 기능을 바꾸었기 때문에 구구단출력
		System.out.println(myProcess); // 원래 주소를 출력하지만 toString을 오버라이딩했기 때문에 구구단출력
	}
}	
