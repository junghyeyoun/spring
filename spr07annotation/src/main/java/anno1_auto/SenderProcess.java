package anno1_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component // 단순하게 객체를 생성
// @Service("senderProcess") // 가독성을 위해 : Sender와 SenderProcess 역할이 다름
@Service
public class SenderProcess {
	// @0Autowired // type에 의한 매핑 : 클래스의 포함 관계
	// private Sender sender;
	
	@Autowired
	@Qualifier("sender") // type이 두개 이상일때는 오류 발생 객체의 이름을 정확하게 입력해서 매핑
	// @Qualifier("sender2")
	private SenderInter inter;
	/*
	@Autowired // 메소드에 자동으로 Sender 타입의 객체를 매핑
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	*/
	
	/*
	public Sender getSender() { // 클래스가 하나일 때
		return sender;
	}
	
	public void displayData() {
		sender.show();
	}
	*/
	
	public SenderInter getInter() {
		return inter;
	}
	
	public void displayData() {
		inter.show();
	}
	
}
