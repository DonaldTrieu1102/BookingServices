package net.nail.bookingservices.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		
		model.addAttribute("greeting", "Hello Spring MVC");
		return "helloworld";
	}
}
