package org.spring.mvc2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");
		System.out.println("Param1: "+s1+", Param2: "+s2);
		ModelAndView modelAndView = new ModelAndView("seccuess.jsp");
		return modelAndView;
	}
}
