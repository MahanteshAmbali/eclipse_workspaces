package org.hib.update;

import org.hib.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Order order1 = new Order();
		order1.setOrderId(1);
		order1.setCustomerName("Sagar");
		order1.setQuantity(100);
		order1.setPrice(190);
		
		Order order2 = new Order();
		order2.setOrderId(2);
		order2.setCustomerName("Dell");
		order2.setQuantity(200);
		order2.setPrice(190.20);
		
		
		Session s1 = Util.getSession();
		Transaction tx = s1.beginTransaction();
		s1.save(order1);
		s1.save(order2);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();*/
		
		Session s2 = Util.getSession();
		Order dupOrder = (Order)s2.load(Order.class, 1);
		dupOrder.setCustomerName("Mahantesh");
		dupOrder.setQuantity(9);
		dupOrder.setPrice(90);
		
		Transaction tx = s2.beginTransaction();
		s2.update(dupOrder);
		tx.commit();
		
		System.out.println("Done");
	}

}
