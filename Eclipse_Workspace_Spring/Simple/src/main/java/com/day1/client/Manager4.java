package com.day1.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.day1.beans.Test;

public class Manager4 {

	public static void main(String[] args) {
		
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		
		System.out.println("-----------------------");
		Test testObj1 = (Test) factory.getBean("test");
		System.out.println("Parameter1 value 1st time: "+ testObj1.getParam1());

		System.out.println("-----------------------");
		Test testObj2 = (Test) factory.getBean("test");
		System.out.println("Parameter1 value 2nd time: "+ testObj2.getParam1());
		
		System.out.println("-----------------------");
		Test testObj3 = (Test) factory.getBean("test");
		System.out.println("Parameter1 value 3rd time: "+ testObj3.getParam1());
		
		System.out.println("-----------------------");
		Test testObj4 = (Test) factory.getBean("test");
		System.out.println("Parameter1 value 4th time: "+ testObj4.getParam1());
		System.out.println("-----------------------");
	}

}
