package com.lara.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beans.Address;
import com.lara.beans.Person;

public class Manager4 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		
		Person perSon = (Person) factory.getBean("person");
		System.out.println("First Name: "+perSon.getFirstName());
		System.out.println("Last Name: "+perSon.getLastName());
		System.out.println("Age: "+perSon.getAge());
		
		Address addr = perSon.getPermanentAddress();
		
		System.out.println("House No: "+addr.getHouseNo());
		System.out.println("Street Name: "+addr.getStreetName());
	}

}
