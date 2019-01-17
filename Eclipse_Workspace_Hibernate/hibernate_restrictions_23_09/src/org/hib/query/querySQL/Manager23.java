package org.hib.query.querySQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager23 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.createSQLQuery("select firstname from Person_Criteria_API where salary > ? and age > ?");
		query.setInteger(0, 30000);
		query.setInteger(1, 30);
		List<Object[]> list = query.list();
		for(Object[] objects : list){
			System.out.println(Arrays.toString(objects));
		}
	}

}
