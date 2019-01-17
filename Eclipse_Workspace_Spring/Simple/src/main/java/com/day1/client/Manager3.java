//CONSTRUCTOR INJECTION

package com.day1.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.day1.beans.Employee;

public class Manager3 {

	public static void main(String[] args) {

		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		Employee fEmployee  = (Employee) factory.getBean("e1");
		
		System.out.println("firstName: "+fEmployee.getFirstName());
		System.out.println("lastName: "+fEmployee.getLastName());
	}

}
