package org.hib.oneToOne.uniDir.WithoutAnno;

import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = Util.getSession();
		Student student = new Student();
		
		student.setFirstName("Mahantesh");
		student.setLastName("Ambali");
		
		Address address = new Address();
		address.setHouseNo("123/3");
		address.setStreetName("BTM");
		address.setStudent(student);
		
		session.beginTransaction();
		//session.save(student);
		session.save(address);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		//session.update(student);
		
		student.setFirstName("Sagar");
		Session session1 = Util.getSession();
		session1.beginTransaction();
		session1.merge(student);
		session1.getTransaction().commit();
		
		System.out.println("Done");
	}
}
