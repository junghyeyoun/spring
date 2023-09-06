package pack;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect // 앞뒤에 주거나 한쪽만 줄 수 있음
public class MyAdvice {
	
	@Around("execution(public void startProcess())")
	// 반환값 Object이어야 함.
	public Object abc(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("AOP 시작");
		
		System.out.println("id 입력 : ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		if(!id.equals("aa")) {
			System.out.println("id 불일치! 핵심 로직 수행을 거부합니다!");
			return null; // 반환값이 object이어야 하는데 null을 주어 핵심 로직 수행 안됨
		}
		
		Object object = joinPoint.proceed(); // pointcut 대상 메소드로 지정된 startProcess를 실행
		
		System.out.println("AOP 끝");
		return object;
	}
}
