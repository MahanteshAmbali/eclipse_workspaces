package org.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping
	public ModelAndView method1(){
		System.out.println("Inside method1()");
		
		return new ModelAndView("success");
	}
}
