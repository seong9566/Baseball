package site.metacoding.red.web;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
	@GetMapping("/index")
	public String getUsers() {
		return "index";
	}
}
