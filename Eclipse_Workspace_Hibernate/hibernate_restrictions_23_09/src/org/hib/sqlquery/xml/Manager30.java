package org.hib.sqlquery.xml;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager30 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.getNamedQuery("q6");
		
		query.setInteger("arg0", 20);
		List<Integer> list = query.list();
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
