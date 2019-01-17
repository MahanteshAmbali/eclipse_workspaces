package org.spring.hib;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class ReadUsingHibTemplteCriteria {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = (HibernateTemplate) Util.getTemplate("hibernateTemplate");
		Person person = (Person) hibernateTemplate.get(Person.class, 3);
		System.out.println("Id: "+person.getId());
		System.out.println("First Name: "+person.getFirstName());
		System.out.println("Lase Name: "+person.getLastName());
		System.out.println("Age: "+person.getAge());
		
		System.out.println("Done");
	}

}
