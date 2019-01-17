// SETTER INJECTION
package com.day1.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.day1.beans.Student;

public class Manager2 {

	public static void main(String[] args) {
		
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		
		System.out.println("-------------------");
		
		Student firstStudent = (Student) factory.getBean("s1");
		
		System.out.println("-------------------");
		System.out.println("First Name: "+firstStudent.getFirstName());
		System.out.println("Last Name: "+firstStudent.getLastName());
		
		System.out.println("-------------------");
	}

}
