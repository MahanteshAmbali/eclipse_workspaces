package com.day2.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Util {

	BeanFactory factory;
	
	static{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		
	}
}
