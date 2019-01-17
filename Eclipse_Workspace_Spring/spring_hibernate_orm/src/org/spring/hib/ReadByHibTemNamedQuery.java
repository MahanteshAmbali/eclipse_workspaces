package org.spring.hib;

import java.util.Arrays;
import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class ReadByHibTemNamedQuery {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = (HibernateTemplate)Util.getTemplate("hibernateTemplate");
		List<Object[]> list = (List<Object[]>) hibernateTemplate.findByNamedQuery("q1");
		System.out.println("------------");
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}

}
