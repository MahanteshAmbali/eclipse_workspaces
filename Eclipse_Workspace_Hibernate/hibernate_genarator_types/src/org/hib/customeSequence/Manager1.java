package org.hib.customeSequence;

import org.hib.genType.Person;
import org.hib.genType.Util;
import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) {
		Session s1 = Util.getSession();
		s1.beginTransaction();
		
		Person person1 = new Person();
		person1.setpId(1);
		person1.setfName("Mahantesh");
		person1.setlName("Ambali");
		
		Person person2 = new Person();
		person2.setpId(2);
		person2.setfName("Dell");
		person2.setlName("Lenovo");
		
		Person person3 = new Person();
		person3.setpId(3);
		person3.setfName("IBM");
		person3.setlName("Hello");
		
		s1.save(person1);
		s1.save(person2);
		s1.save(person3);

		s1.getTransaction().commit();
		
		
		System.out.println("Done");
	}

}
