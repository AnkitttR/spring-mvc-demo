package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm") // Lead to helloworld-form.jsp
	public String showForm(Model theModel) {
	
	//for customer-form, Model attribute name is customer & value is new Customer().
	theModel.addAttribute("customer", new Customer());
	
	return "customer-form";
		
}
	@RequestMapping("/processForm")  
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
		
		return "customer-confirmation";
	//Spring will store results of validation in BindingResult object
				
	}
}