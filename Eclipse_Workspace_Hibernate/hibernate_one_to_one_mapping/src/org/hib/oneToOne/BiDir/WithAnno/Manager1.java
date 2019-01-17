package org.hib.oneToOne.BiDir.WithAnno;

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
		
		student.setAddress(address);
		address.setStudent(student);
		
		session.beginTransaction();
		session.save(student);
		session.save(address);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		System.out.println("Done");
	}
}
