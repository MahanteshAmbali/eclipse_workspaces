package com.day2.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Util {

	public static BeanFactory factory = null;
	
	static{
		
		ClassPathResource cpr = new ClassPathResource("config.xml");
		factory = new XmlBeanFactory(cpr);
		
	}
	
	public static Object getObject(String str){
		
		return factory.getBean(str);
		
	}
}
