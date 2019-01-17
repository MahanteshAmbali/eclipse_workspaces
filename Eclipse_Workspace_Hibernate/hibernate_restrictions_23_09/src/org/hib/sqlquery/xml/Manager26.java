package org.hib.sqlquery.xml;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager26 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.getNamedQuery("q2");
		query.setString(0, "%ha%");
		query.setInteger(1, 30);
		List<Object[]> list = query.list();
		for(Object[] records : list){
			System.out.println(Arrays.toString(records));
		}
	}

}
