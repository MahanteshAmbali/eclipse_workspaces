package org.spring.mvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class LoginController extends SimpleFormController{

	protected ModelAndView onSubmit(Object command) throws Exception {
		// TODO Auto-generated method stub
		LoginForm loginForm = (LoginForm)command;
		
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("username", username);
		modelAndView.addObject("password", password);
		
		modelAndView.setViewName("success.jsp");
		return modelAndView;
	}
}
