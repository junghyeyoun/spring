package anno1_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component // Sender sender = new Sender(); : Sender 객체가 Singleton type으로 만들어짐
@Component("sender") // 위와 같은 듯
// @Component("mysender") 이름 바뀜
@Scope // 빈의 생존범위 기본 값 : singleton // prototype, request, session ...
public class Sender implements SenderInter {
	public void show() {
		System.out.println("show method 수행~~~");
	}
}
