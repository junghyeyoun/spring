package pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class GuguController {
	
	@GetMapping ("gugudan")
	public String submitCall() {
		return "redirect:http://localhost/gugudan.html"; // redirect
	}
	
	@PostMapping("gugudan")
	public String submit(Model model, @RequestParam(value = "dan")int dan) {
	      String data = "";
	       // 구구단 계산 및 문자열 생성
	       for (int i = 1; i <= 9; i++) {
	           int result = dan * i;
	           data += dan + " * " + i + " = " + result + "<br/>";
	       }
	      
	      
	      model.addAttribute("data", data);
	      return "result3";
	   }
}
