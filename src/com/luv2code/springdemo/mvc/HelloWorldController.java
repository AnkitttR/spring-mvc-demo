package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // This tells spring, hey spring this is a MVC Controller
public class HelloWorldController {

	//need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
		
	}
	
	//now a controller method to read form data & 
	//add data to the model 
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML form
		
		//Convert the data to all UpperCase
		
		//Create the message
		
		//add message to the model
		return "helloworld";
		
	}
	
}
