package org.spring.mvc;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestFormController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		String firstName = arg0.getParameter("firstName");
		String lastName = arg0.getParameter("lastName");
		
		System.out.println("Firstname: "+firstName);
		System.out.println("Lastname: "+lastName);

		ModelAndView modelAndView = new ModelAndView("success.jsp");
		return modelAndView;
	}
}
