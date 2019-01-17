package org.spring.hib;

import java.util.Arrays;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class ReadByUsingSQLWQueries {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = (HibernateTemplate)Util.getTemplate("hibernateTemplate");
		HibernateCallback hibernateCallback = new HibernateCallback() {
			
			public Object doInHibernate(Session arg0)
				throws HibernateException{
				
				List<Object[]> list = (List<Object[]>) arg0.createSQLQuery("select * from Person_Spring_hib").list();
				return list;
			}
		};
		
		List<Object[]> list = (List<Object[]>) hibernateTemplate.execute(hibernateCallback);
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
		
		
	}

}
