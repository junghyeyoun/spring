package pack.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectClass {
	@Autowired
	private SecurityClass class1; // 클래스의 포함관계를 통해 관심사항 추가
	
	@Around("execution(public String processMsg()) or execution(public String businessMsg())")
	public Object aspProcess(ProceedingJoinPoint joinPoint) throws Throwable {
		class1.mySecurity();
		
		Object object = joinPoint.proceed(); // 핵심 메소드 수행
		
		return object;
	}
}
