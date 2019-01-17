package org.spring.hib;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class Manager6 {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = Util.getTemplate("hibernateTemplate");
		
		for (int i = 1; i <= 2; i++) {
		
			Person person = (Person) hibernateTemplate.get(Person.class, i);
			System.out.println("Person id: "+person.getId());
			System.out.println("Person Firstname: "+person.getFirstName());
			System.out.println("Person Lastname: "+person.getLastName());
			System.out.println("Person Age: "+person.getAge());
		
			System.out.println("--------------");
		}		
	}
}
