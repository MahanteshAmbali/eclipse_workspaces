package org.spring.hib;

import java.util.Arrays;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class Manager11 {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = Util.getTemplate("hibernateTemplate");
		HibernateCallback hibernateCallback = new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session arg0) throws HibernateException {

				List<Object[]> list = arg0.createSQLQuery("select * from Person_Spring_Hib").list();
				return list;
			}
		};
		
		List<Object[]> list = hibernateTemplate.execute(hibernateCallback);
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}

}
