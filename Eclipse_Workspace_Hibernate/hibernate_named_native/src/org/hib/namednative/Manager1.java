package org.hib.namednative;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.getNamedQuery("q1");
		List<Object[]> list = query.list();
		for(Object[] records : list){
			System.out.println(Arrays.toString(records));
		}
	}

}
