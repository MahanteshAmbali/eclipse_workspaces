package com.lara.beforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class Advice1 implements MethodBeforeAdvice
{

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		
		System.out.println("Advice Started");
		System.out.println(arg0.getName());
		System.out.println(Arrays.toString(arg1));
		System.out.println(arg2.getClass());
		System.out.println("Aspect Ended");		
	}

	
}
