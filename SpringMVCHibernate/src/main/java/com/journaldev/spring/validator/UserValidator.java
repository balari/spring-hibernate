package com.journaldev.spring.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.journaldev.spring.model.User;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		User user = (User) target;

		/*
		 * ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "", "");
		 * ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.required",
		 * "");
		 */
		if (!(user.getPassword().equals(user.getConfirmpassword()))) {

			errors.rejectValue("password", "password.notmatched");
		}

		if (!(user.getEmail().equals(user.getConfirmemail()))) {

			errors.rejectValue("email", "email.notmatched");
		}
	}

}
