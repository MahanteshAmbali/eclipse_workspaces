package org.hib.many_to_many;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchFromDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = null;
		Transaction transaction = null;
		Orders orders = null;
		Products products = null;
		
		try {
			session = new Configuration().configure().buildSessionFactory().openSession();
			transaction = session.beginTransaction();
			Query query = session.createSQLQuery("select * from flipkart");
			List<Object[]> list = query.list();
			for (Object[] objects : list) {
				
				System.out.println(Arrays.toString(objects));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.rollback();
		}finally{
			session.close();
		}
		
	}

}
