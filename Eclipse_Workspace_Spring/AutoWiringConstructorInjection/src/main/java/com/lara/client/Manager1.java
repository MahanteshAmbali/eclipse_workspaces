package com.lara.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beans.Book;
import com.lara.beans.Employee;

public class Manager1 {

	public static void main(String[] args) {

		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		
		Employee emp1 = (Employee) factory.getBean("employee");
		
		System.out.println("Employee Name: "+emp1.getFirstName());
		
		Book book1 = emp1.getBook();
		System.out.println("Book Title: "+book1.getTitle());
		System.out.println("Book Author: "+book1.getAuthor());
	}

}
