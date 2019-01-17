package com.lara.client;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beans.Employee;

public class Manager1 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		
		Employee emp = (Employee)factory.getBean("empl");
		
		System.out.println("First Name: "+emp.getFirstName());
		System.out.println("Age: "+emp.getAge());
		System.out.println("Weight: "+emp.getWeight());
		System.out.println("Mail-ids: "+(Arrays.toString(emp.getMails())));
		System.out.println("Mobile Nos: "+emp.getMobileNos());
		System.out.println("Lover Names: "+emp.getLoverNames());
		System.out.println("Education: "+emp.getEducation());
		System.out.println("Project: "+emp.getProject());
	}
}
