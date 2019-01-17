package com.lara.client;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beans.Employee;

public class Manager2 {

	public static void main(String[] args)
	{
		ClassPathResource cpr = new ClassPathResource("bean.xml");
		BeanFactory fc = new XmlBeanFactory(cpr);
		
		Employee em1 = (Employee)fc.getBean("emp");
		
		System.out.println("FirstName: "+em1.getFirstName());
		System.out.println("LastName: "+em1.getLastName());
		System.out.println("Age: "+em1.getAge());
		System.out.println("Marks: "+Arrays.toString(em1.getMarks()));
	}
}
