package com.cartocracy.aboutsroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	
	@RequestMapping("/human")
	public String human(@RequestParam(value="fn", required = false) String firstName, @RequestParam(value="ln", required = false) String lastName) {
		
		if(firstName == null) {
			if(lastName == null) {
				return "Hello Human";
			} else {
				return "Hello M. " + lastName +".";
			}
		} else if(lastName == null) {
			return "Hello " + firstName +".";
		} else {
			return "Hello " + firstName + " " + lastName + ".";
		}
	}

}
