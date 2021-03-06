package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // This tells spring, hey spring this is a MVC Controller
@RequestMapping("/hello")
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
		String theName = request.getParameter("studentName");
		
		//Convert the data to all UpperCase
		theName = theName.toUpperCase();
		
		//Create the message
		String result = "Yo! " + theName;
		
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
		
	}
	
	//now a controller method to read form data & 
		//add data to the model 
		
		@RequestMapping("/processFormVersionThree")
		public String processFormVersionThree(
				@RequestParam("studentName") String theName, Model model) {
//@RequestParam binded input studentName to String (theName)
		
			
//			//read the request parameter from the HTML form
//			String theName = request.getParameter("studentName"); // No longer needed because @RequestParam is used above
			
			//Convert the data to all UpperCase
			theName = theName.toUpperCase();
			
			//Create the message
			String result = "Hey my friend from v3! " + theName;
			
			//add message to the model
			model.addAttribute("message",result);
			
			return "helloworld";
}}
