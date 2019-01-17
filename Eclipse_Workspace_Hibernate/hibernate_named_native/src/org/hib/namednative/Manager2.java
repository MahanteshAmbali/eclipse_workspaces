package org.hib.namednative;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager2 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.getNamedQuery("q2");
		List<BigDecimal[]> list = (List<BigDecimal[]>)query.list();
		for(BigDecimal[] records : list){
			System.out.println(Arrays.toString(records));
		}
	}

}
