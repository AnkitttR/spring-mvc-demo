package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

// CourseCodeConstarintValidator.class is helper class that contains validation logic
//@Target tells about the target where to apply the custom annotation CourseCode, i.e can apply
// custom annotation to method or field
//@Retention is for how long the custom annotation will bw stored or used
@Constraint(validatedBy = CourseCodeConstarintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

}
