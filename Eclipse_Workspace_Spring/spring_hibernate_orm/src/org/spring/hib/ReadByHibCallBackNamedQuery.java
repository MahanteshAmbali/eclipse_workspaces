package org.spring.hib;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class ReadByHibCallBackNamedQuery {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = (HibernateTemplate)Util.getTemplate("hibernateTemplate");
		HibernateCallback hibernateCallback = new HibernateCallback() {
			
			public Object doInHibernate(Session session){
				List<Object[]> list = (List<Object[]>) session.getNamedQuery("q1").list();
				
				return list;
			}
		};
		
		List<Object[]> list = (List<Object[]>) hibernateTemplate.execute(hibernateCallback);
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}

}
