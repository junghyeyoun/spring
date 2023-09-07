package pack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	// Logging이란 프로그램 개발 중이나 완료 후 발생할 수 있는 오류에 대해 디버깅하거나 운영 중인 프로그램 상태를 모니터링 하기 위해 필요한 정보(로그)를 기록하는 것
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("login")
	public String submitcall() {
		return "redirect:http://localhost/login.html"; // redirect 방식 / 기본은 forward
	}
	
	// 방법 1 : 전통적 방법 사용하여 클라이언트 값 받기
	/*
	@GetMapping("loginget")
	public String submit(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("console로 출력 : "+id+" "+pwd); // 프로그램 진행중 값 확인하기
		logger.info("진행 도중 로그 정보를 출력 : "+id+" "+pwd); // 로그 레벨 trace > info > warn > error // web상에서는 이 방법으로 확인하는 것이 좋음
		
		String data = "";
		if(id.equals("aa")&&pwd.equals("11"))
			data = "로그인 성공";
		else
			data = "로그인 실패";
		
		model.addAttribute("data",data);
		return "result"; // forwarding 
	}
	*/
	
	// 방법 2 : spring 방법 사용하여 클라이언트 값 받기 - annotation 사용
	@GetMapping("loginget")
	public String submit(@RequestParam(value = "id") String id, @RequestParam("pwd") String pwd, Model model ) { // 값을 바로 int로 받을 수 있어 좋음 -> 캐스팅 안해도 됨
		String data = "";
		if(id.equals("aa")&&pwd.equals("11"))
			data = "로그인 성공!!";
		else
			data = "로그인 실패ㅠㅠ";
		
		model.addAttribute("data",data);
		return "result"; // forwarding 
	}
}
