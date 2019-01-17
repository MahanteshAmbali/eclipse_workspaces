package org.hib.delete;

import org.hib.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Laptop laptop1 = new Laptop();
		laptop1.setDisplaySize(15.6);
		laptop1.setLapId(1);
		laptop1.setManfName("Dell");
		
		Laptop laptop2 = new Laptop();
		laptop2.setDisplaySize(14);
		laptop2.setLapId(2);
		laptop2.setManfName("HP");
		
		Session s1 = Util.getSession();
		s1.beginTransaction();
		s1.save(laptop1);
		s1.save(laptop2);
		s1.getTransaction().commit();
		
		s1.flush();
		s1.close();*/
		
		Session s2 = Util.getSession();
		Transaction tx = s2.beginTransaction();
		Laptop deleteLap1 = (Laptop) s2.load(Laptop.class, 1);
		s2.delete(deleteLap1);
		s2.getTransaction().commit();
		s2.flush();
		s2.close();
		
		System.out.println("Done");
		
	}

}
