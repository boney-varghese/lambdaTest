package com.lambda.lambdaTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/test")
	public String test(@RequestParam String name) {
		
		return "Hello "+name;
	}
}
