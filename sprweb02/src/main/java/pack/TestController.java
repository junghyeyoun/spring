package pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


// 하위 패키지만 스캔하기 때문에 pack과 동등한 위치말고 하위에 파일을 만들어야 한다.

// 주로 사용자의 요청을 처리(모델을 경유) 한 후 지정된 뷰에 모델 객체를 전달하는 역할. 클라이언트와 데이터 입출력을 제어하는 클래스 
@Controller
public class TestController {

	@RequestMapping("test1") // DispatcherServlet으로 부터 위임받은 HandlerMapping에 의해 처리
	public ModelAndView abc() {
		// BL 처리 또는 모델 영역을 수행하는 역할
		System.out.println("abc 처리");
		
		// Model 인터페이스는 처리한 데이터를 뷰에 표시하기 위한 데이터를 전달 HttpServletRequest 객체를 사용함
		
		// HttpServletRequest request = new HttpServletRequest();
		// request.setAttribute("msg", "나이스"); 아래와 같은 뜻
		
		return new ModelAndView("list","msg","나이스"); //(뷰파일명,키,데이터)
		
		// DispatcherServlet으로 부터 위임받은 ViewResolver에 의해 처리
	}
	
	@RequestMapping(value="test2", method=RequestMethod.GET) // 위에를 더 자세하게 쓰자면 // value={"test2","hi","hello"}
	public ModelAndView abc2() {
		return new ModelAndView("list","msg","나이스2");
	}
	
	@GetMapping("test3") // get 요청 처리용 전용 annotation
	public ModelAndView abc3() {
		return new ModelAndView("list","msg","나이스3");
	}
	
	@GetMapping("test4")
	public String abc4(Model model) {
		model.addAttribute("msg","나이스4");
		return "list";
	}
	
	@RequestMapping(value="test5", method=RequestMethod.POST) // index에서 post방식으로 넘겨주기 때문에 post로 받음
	public ModelAndView abc5() {
		return new ModelAndView("list","msg","post 요청 성공5");
	}
	
	@PostMapping("test6") // post 요청 처리용 전용 annotation
	public ModelAndView abc6() {
		return new ModelAndView("list","msg","post 요청 성공6");
	}
	
	@PostMapping("test7")
	public String abc7(Model model) {
		model.addAttribute("msg","post 요청 성공7");
		return "list";
	}
	
	@GetMapping("test8")
	@ResponseBody // ajax하려면 꼭 알아야함
	public String abc8(Model model) {
		String value = "일반적인 데이터(String, MAP, JSON 등을 전달)";
		return value;
	}
	

	@GetMapping("test8_1")
	@ResponseBody // ajax하려면 꼭 알아야함
	public DataDto abc8_1(Model model) {
		DataDto dto = new DataDto();
		dto.setName("신기해");
		return dto; // JSON 형태로 반환(jackson 라이브러리가 자동 지원 )
	}
}
