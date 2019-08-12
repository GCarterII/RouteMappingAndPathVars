package com.cartocracy.aboutsroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/{dojo}")
	public String dojos(@PathVariable("dojo") String dojo) {
		System.out.println(dojo);
		if(dojo == null) {
			return "Guess you don't care about the dojos?";
		} else if(dojo.equalsIgnoreCase("San Jose") || dojo.equalsIgnoreCase("SanJose") || dojo.equalsIgnoreCase("SJ")) {
			return "You're Michael's favorite there in the San Jose location";
		}else if(dojo.equalsIgnoreCase("Berkeley") || dojo.equalsIgnoreCase("Emmeryville") || dojo.equalsIgnoreCase("Oakland")) {
			return "They call it Berkeley, but it's really Emmeryville... guess Berkeley just has more cache to it..";
		} else {
			return "I don't know your dojo... sorry?";
		}
	}

}
