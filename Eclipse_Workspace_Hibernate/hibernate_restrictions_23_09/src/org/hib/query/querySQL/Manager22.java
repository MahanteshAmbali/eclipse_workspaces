package org.hib.query.querySQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager22 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.createSQLQuery("select person_id, address, salary from Person_Criteria_Api where firstname =:arg0");
		
		query.setString("arg0", "Mahantesh");
		List<Object[]> list = query.list();
		
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
		
		query.setString("arg0", "Sagar");
		List<Object[]> list1 = query.list();
		
		for (Object[] objects : list1) {
			System.out.println(Arrays.toString(objects));
		}
	}

}
