package org.hib.oneToOneAnno;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Employee employee1 = new Employee();
		employee1.setFirstName("Mahantesh");
		employee1.setLastName("Ambali");
		
		Address address1 = new Address();
		address1.setAddressLine1("BTM 1st stage");
		address1.setCity("Bangalore");
		address1.setState("Karnataka");
		
		employee1.setAddress(address1);
		address1.setEmployee(employee1);
		
		session.beginTransaction();
		session.save(employee1);
		session.save(address1);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		System.out.println("Done");
	}

}
