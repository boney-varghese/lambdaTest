package com.lambda.lambdaTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String test() {
		
		return "Hello World111";
	}
}
