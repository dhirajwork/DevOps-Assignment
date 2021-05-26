package com.devops.hotelreservation.assignment.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = EmailValidator.class)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidEmail {
	
	// custom annotation for get required email with custom regex pattern
	
	String message() default "Invalid email";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
