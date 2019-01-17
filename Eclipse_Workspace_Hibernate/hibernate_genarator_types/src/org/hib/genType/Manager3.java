package org.hib.genType;

import org.hibernate.Session;

public class Manager3 {

	public static void main(String[] args) {

		Session s1 = Util.getSession();
		s1.beginTransaction();
		
		Person person1 = new Person();
		person1.setfName("Mahantesh");
		person1.setlName("Ambali");
		
		Person person2 = new Person();
		person2.setfName("Dell");
		person2.setlName("Lenovo");
		
		Person person3 = new Person();
		person3.setfName("IBM");
		person3.setlName("Hello");
		
		Integer obj1 = (Integer)s1.save(person1);
		Integer obj2 = (Integer)s1.save(person2);
		Integer obj3 = (Integer)s1.save(person3);
		
		
		System.out.println(obj1+""+obj2+""+obj3);
		s1.getTransaction().commit();
		
		
		System.out.println("Done");
	}

}
