package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("beans.xml");
		BeanFactory factory =new XmlBeanFactory(cpr);
		
		Person per=(Person)factory.getBean("p1");
		
		System.out.println(per.getFirstName());
		System.out.println(per.getLastName());
		System.out.println(per.getAge());
		
	} 
	

}
