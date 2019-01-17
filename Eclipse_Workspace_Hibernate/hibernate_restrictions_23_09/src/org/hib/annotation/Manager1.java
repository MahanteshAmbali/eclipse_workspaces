package org.hib.annotation;

import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		session.beginTransaction();
		
		Person person = new Person();
		person.setPersonId(1);
		person.setPersonFirstName("Sagar");
		person.setPersonAddress("BTM");
		person.setPersonEducation("BE");
		person.setPersonAge(30);
		person.setPersonSalary(20304);	
		
		session.save(person);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		System.out.println("ENJOY KARO");
	}

}
