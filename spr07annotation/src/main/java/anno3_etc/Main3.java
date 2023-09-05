package anno3_etc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

	public static void main(String[] args) {
		// 기타 annotation 연습용
		ApplicationContext context = new ClassPathXmlApplicationContext("anno3.xml");
		
		MyProcess myProcess = (MyProcess)context.getBean("myProcess");
		myProcess.showResult();
		
	}

}
 