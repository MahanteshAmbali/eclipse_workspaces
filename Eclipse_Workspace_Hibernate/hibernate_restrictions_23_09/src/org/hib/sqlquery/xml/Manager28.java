package org.hib.sqlquery.xml;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager28 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.getNamedQuery("q4");
		List<Integer> list = query.list();
		for(Integer salary : list){
			System.out.println(salary);
		}
	}

}
