package com.lara.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beans.Person;

public class Manager1 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		
		Person p1 = (Person) factory.getBean("obj");
		System.out.println("First Name: "+p1.getFirstName());
		System.out.println("Last Name: "+p1.getLastName());
		System.out.println("Age: "+p1.getAge());

		
	}

}
