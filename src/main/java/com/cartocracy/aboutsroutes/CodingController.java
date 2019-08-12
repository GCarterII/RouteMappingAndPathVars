package com.cartocracy.aboutsroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	
	@RequestMapping("")
	public String coding() {
		return "Hello Dojo...";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "I don't remember Python at all... like at all at all...";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java's the end of the road for me... no more coding dojo after this! :-(";
	}

}
