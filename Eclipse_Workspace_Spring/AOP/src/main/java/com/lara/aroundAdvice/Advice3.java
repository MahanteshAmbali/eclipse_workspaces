package com.lara.aroundAdvice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

public class Advice3 implements IntroductionInterceptor{

	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Method Name: "+arg0.getMethod().getName());
		System.out.println("Class Name: "+arg0.getThis().getClass());
		System.out.println("Arguments to Method(): "+Arrays.toString(arg0.getArguments()));
		System.out.println("Before Proceed");
		//Object obj = arg0.proceed();
		System.out.println("After Proceed");
		return null;
	}

	public boolean implementsInterface(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	
}
