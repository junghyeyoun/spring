package pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AbcController {
	
	@GetMapping(value="kbs/login", params="type=admin")
	public String kbs(Model model) {
		model.addAttribute("message","관리자");
		return "list";
	}
	
	@GetMapping(value="kbs/login", params="type=user")
	public String mbc(Model model) {
		model.addAttribute("message","일반회원");
		return "list";
	}
	
	@GetMapping(value="kbs/login", params="!type")
	public String sbs(Model model) {
		model.addAttribute("message","type값 없음");
		return "list";
	}
	
	@PostMapping(value="kbs/login", params="type=user")
	public String ytn(Model model) {
		model.addAttribute("message","일반회원입니다.");
		return "list";
	}
	
	@GetMapping(value="mbc/{url}") // {이름} 내맘대로 설정 가능 usa, korea 값 받는 거임
	// @RequestParam은 name="tom" ...
	public String aaa(@RequestParam("name") String name, @PathVariable String url, Model model) { 
		model.addAttribute("message","이름은 " + name +" "+"국적은 "+url );
		return "list";
	}
	
	@GetMapping(value="ent/{co}/singer/{singer}") 
	public String bbb(@RequestParam("title") String title, @PathVariable String co, @PathVariable String singer , Model model) { 
		String ss = "소속사 : " + co + " 가수 : " +singer + " 타이틀 : " + title;
		model.addAttribute("message",ss);
		return "list";
	}
	

	
}
