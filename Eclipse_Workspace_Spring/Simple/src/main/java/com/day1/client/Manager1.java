//SETTER INJECTION

package com.day1.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.day1.beans.Person;

public class Manager1 {

	public static void main(String[] args) {
		
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		Person p1 = (Person) factory.getBean("p1");
		
		System.out.println("----------------");
		System.out.println("Name: "+p1.getFirstName());
		System.out.println("Age: "+p1.getAge());
		System.out.println("----------------");
	}

}
