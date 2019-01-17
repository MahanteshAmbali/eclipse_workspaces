package com.lara.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beans.Address;
import com.lara.beans.Person;

public class Manager5
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		
		Person perSon = (Person)factory.getBean("person");
		
		System.out.println("First Name: "+perSon.getFirstName());
		System.out.println("Age: "+perSon.getAge());
		System.out.println("Weight: "+perSon.getWeight());
		System.out.println("Mails: "+perSon.getMails());
		System.out.println("Mobile No: "+perSon.getMobiles());
		System.out.println("Lover Names: "+perSon.getLoverNames());
		System.out.println("Education: "+perSon.getEducation());
		System.out.println("Project: "+perSon.getProject());
		System.out.println("----------------------------------");
		
		Address addr = perSon.getPermanentAddress();
		
		System.out.println("House No: "+addr.getHouseNo());
		System.out.println("Street Name: "+addr.getStreetName());
	}
}
