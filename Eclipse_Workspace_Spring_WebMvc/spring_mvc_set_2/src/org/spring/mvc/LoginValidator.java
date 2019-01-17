package org.spring.mvc;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {

		return arg0.equals(LoginForm.class);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {

		LoginForm loginForm = (LoginForm) arg0;
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		if(username == null || username.length() == 0){
			arg1.rejectValue("username", "loginForm.username.required", "Username is mandatory");
		}
		
		if(password == null || password.length() == 0){
			arg1.rejectValue("password", "loginForm.password.required", "Password is madatory");
		}
	}
}
