package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack.setterex.MyProcessService;

@SpringBootApplication
public class Sprweb04thymeleafApplication {

	public static void main(String[] args) {
		// SpringApplication.run(Sprweb04thymeleafApplication.class, args).getBean(Sprweb04thymeleafApplication.class).myExecute();
		// getBean이전은 web으로 수행, getBean 이후에 코드 작성하면 application으로도 수행 가능
		
		SpringApplication.run(Sprweb04thymeleafApplication.class, args);
	} 

	@Autowired
	MyClass class1;

	private void myExecute() {
		System.out.println("금요일 좋아~");

		class1.aaa();
		
		// 이전 setter 연습용 소스 실행
		ApplicationContext context = new ClassPathXmlApplicationContext("myinit.xml"); 

		MyProcessService service = (MyProcessService) context.getBean("myProcess");
		service.displayData();
	}
}
