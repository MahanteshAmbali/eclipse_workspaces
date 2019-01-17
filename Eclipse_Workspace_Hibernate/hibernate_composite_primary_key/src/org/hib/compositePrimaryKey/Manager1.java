package org.hib.compositePrimaryKey;

import org.hibernate.Session;

public class Manager1 {
	
	public static void main(String[] args) {
	
		PersonPK personPK = new PersonPK();
		personPK.setPersonId(1);
		personPK.setPersonMailId("mahantesh378@gmail.com");
		
		Person person = new Person();
		person.setPersonFirstName("Mahantesh");
		person.setPersonLastName("Ambali");
		person.setAge(29);
		person.setPersonPK(personPK);
		
		PersonPK personPK1 = new PersonPK();
		personPK1.setPersonId(2);
		personPK1.setPersonMailId("mahantesh378@gmail.com");
		
		Person person1 = new Person();
		person1.setPersonFirstName("Mahantesh");
		person1.setPersonLastName("Ambali");
		person1.setAge(29);
		person1.setPersonPK(personPK1);
		
		Session session = Util.getSession();
		session.beginTransaction();
		
		session.save(person);
		session.save(person1);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		
		System.out.println("Done");
	}
}
