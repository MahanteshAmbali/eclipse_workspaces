package org.spring.hib;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class ReadUsingHibTemplateQueryFind {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = (HibernateTemplate)Util.getTemplate("hibernateTemplate");
		List<Person> list = (List<Person>) hibernateTemplate.find("from Person");
		System.out.println("----------------");
		for (Person person : list) {
			System.out.println(person.getId());
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
			System.out.println(person.getAge());
			System.out.println("----------------");
		}
	}

}
