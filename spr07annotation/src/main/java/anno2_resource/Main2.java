package anno2_resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		// Resource 연습용
		// Configuration 파일이 복수인 경우 
		String[] metas = new String[] {"anno2.xml"}; // 여러개 만들 수 있음
		ApplicationContext context = new ClassPathXmlApplicationContext("anno2.xml");
		
		AbcProcess process = context.getBean("ap", AbcProcess.class); // AbcProcess의 이름 ap임
		process.showData();
		
	}

}
 