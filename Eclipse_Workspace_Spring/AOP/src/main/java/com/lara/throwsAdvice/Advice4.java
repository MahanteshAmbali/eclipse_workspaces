package com.lara.throwsAdvice;

import org.springframework.aop.ThrowsAdvice;

public class Advice4 implements ThrowsAdvice{
	
	public void afterThrowing(NullPointerException ex){
		System.out.println("NPE Occured: "+ex);
	}
	
	public void afterThrowing(ClassCastException ex){
		System.out.println("CCE Occured: "+ex);
	}
}
