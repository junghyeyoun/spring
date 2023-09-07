package pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("test9")
public class TestController2 {

	// @RequestMapping(value = "test9", method=RequestMethod.GET) // 위에서 @RequestMapping("test9") 써준다면 생략하고 method만 써줄 수 있음
	@RequestMapping(method=RequestMethod.GET)
	public String def(Model model) {
		model.addAttribute("msg","sucess get");
		return "list"; // forward 방식
	}
	
	// @RequestMapping(value = "test9", method=RequestMethod.POST)
	@RequestMapping(method=RequestMethod.POST)
	public String def2(Model model) {
		model.addAttribute("msg","sucess post");
		return "list"; // forward 방식
	}
}
