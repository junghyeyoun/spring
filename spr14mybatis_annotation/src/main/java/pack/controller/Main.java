package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("dbinit.xml");
		BusinessInter businessInter = (BusinessInter)context.getBean("businessImpl");
		
		businessInter.dataShow();
		System.out.println("\n부서별 인원수");
		businessInter.dataShow2();
		System.out.println("\n부서별 최고 연봉자");
		businessInter.dataShow3();
		((ConfigurableApplicationContext)context).close();

	}

}
