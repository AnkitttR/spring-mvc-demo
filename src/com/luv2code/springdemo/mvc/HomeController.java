package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    // This tells Spring, hey Spring this is a MVC Controller
public class HomeController {

	@RequestMapping("/")   //Url request will execute this mapped method
	public String showPage() {
		return "main-menu";	// This method will show main-menu web page
	}
	
	
	
}
