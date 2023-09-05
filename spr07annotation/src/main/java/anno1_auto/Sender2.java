package anno1_auto;

import org.springframework.stereotype.Component;

@Component
public class Sender2 implements SenderInter{
	@Override
	public void show() {
		System.out.println("Sender2 class의 show method 수행~~~");
	}
}
