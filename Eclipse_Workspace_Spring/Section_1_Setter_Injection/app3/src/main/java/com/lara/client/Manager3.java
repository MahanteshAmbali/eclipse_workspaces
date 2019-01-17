package com.lara.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beans.Student;

public class Manager3 
{
	public static void main(String[] args)
	{
		ClassPathResource cpr = new ClassPathResource("build.xml");
		BeanFactory fc = new XmlBeanFactory(cpr);
		
		Student student1 = (Student)fc.getBean("stud");
		Student student2 = (Student)fc.getBean("stud");
		Student student3 = (Student)fc.getBean("stud");
		
		System.out.println("Student 1: "+student1);
		System.out.println("Student 2: "+student2);
		System.out.println("Student 3: "+student3);
		System.out.println("Done");
	}

}
