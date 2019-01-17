package org.hib.many_to_many;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertToDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = null;
		Transaction transaction = null;
		
		Orders order1 = new Orders();
		order1.setOrderId("37ADF734");
		order1.setCustomerFullName("Mahantesh Ambali");
		order1.setLocationToDeliver("BTM Layout");
		
		Orders order2 = new Orders();
		order2.setOrderId("JDFH234J");
		order2.setCustomerFullName("Shivaprasad Patil");
		order2.setLocationToDeliver("BTM Layout");
		
		Products product1 = new Products();
		product1.setProductId("PHIL3402");
		product1.setProductManf("Philips");
		product1.setProductPrice(899.38);
		
		Products product2 = new Products();
		product2.setProductId("PANS490");
		product2.setProductManf("Panasonic");
		product2.setProductPrice(999.3);
		
		product1.addOrders(order1);
		product1.addOrders(order2);
		product2.addOrders(order1);
		product2.addOrders(order2);
		
		try {
			session = new Configuration().configure().buildSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(order1);
			session.save(order2);
			session.save(product1);
			session.save(product2);
			
			transaction.commit();
			session.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.rollback();
		}finally{
			session.close();
		}
		
		System.out.println("Data Inserted in to DB, Successfully.!");
	}

}
