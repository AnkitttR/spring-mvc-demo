package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// CourseCodeConstarintValidator.class is helper class that contains validation logic
//@Target tells about the target where to apply the custom annotation CourseCode, i.e can apply
// custom annotation to method or field
//@Retention is for how long the custom annotation will bw stored or used
@Constraint(validatedBy = CourseCodeConstarintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)      //Retain this annotation in java class file & process it at runtime
public @interface CourseCode {

	// define default course code
	public String value() default "LUV";
	
	// define default error message
	public String message() default "must start with LUV";
	
	// define default groups //can group related constraints
	public Class<?>[] groups() default {};
	
	// define default payloads //provide custom details about validation failure
	public Class<? extends Payload>[] payload() default {};
	
	
}
