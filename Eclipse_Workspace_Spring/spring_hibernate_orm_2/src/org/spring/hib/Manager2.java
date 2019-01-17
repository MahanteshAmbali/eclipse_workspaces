package org.spring.hib;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class Manager2 {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = Util.getTemplate("hibernateTemplate");
		Person person = new Person();
		person.setId(1);
		person.setFirstName("Mahantesh");
		person.setLastName("Ambali");
		person.setAge(20);
		
		hibernateTemplate.save(person);
		
		System.out.println("Done");
	}

}
