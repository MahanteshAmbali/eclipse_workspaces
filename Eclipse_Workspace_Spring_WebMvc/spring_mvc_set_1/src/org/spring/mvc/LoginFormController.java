package org.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginFormController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		String username = arg0.getParameter("username");
		String password = arg0.getParameter("password");
		
		ModelAndView mav = new ModelAndView();
		
		if(username.equals("Mahantesh") && password.equals("password")){
			mav.addObject("msg", "Login Successfull..!");
			mav.setViewName("success.jsp");
		}else{
			mav.addObject("msg", "Username/Password Incorrect.!");
			mav.setViewName("loginFail.jsp");
		}
		
		return mav;
	}
}
