package org.hib.query.querySQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager21 {

	public static void main(String[] args) {

		Session s1 = Util.getSession();
		Query query = s1.createSQLQuery("select * from PERSON_CRITERIA_API");
		List<Object[]> list = query.list();
		for(Object[] record : list){
			System.out.println(Arrays.toString(record));
		}
	}

}
