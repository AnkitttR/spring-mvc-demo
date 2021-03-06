package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstarintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	//Spring MVC will call : isValid()
	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		
		// Test if form data starts with course prefix
		boolean result;
		
		if(theCode!= null) {
		result = theCode.startsWith(coursePrefix);
		}
		else {
			result = true;
		}
		
		return false;
	}

	
	
}
