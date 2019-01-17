package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/hello")
public class HelloController{
 
   @RequestMapping(value = "/hello")
   public ModelAndView method1(){
	   
	   System.out.println("In method1()");
	   return new ModelAndView("success");
   }
}