package org.hib.query.querySQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager24 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.createSQLQuery("select * from Person_Criteria_Api where age > =:arg0");
		query.setInteger("arg0", 30);
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}

}
