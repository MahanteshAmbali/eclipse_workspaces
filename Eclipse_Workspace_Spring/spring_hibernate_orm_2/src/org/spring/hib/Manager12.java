package org.spring.hib;

import java.util.Arrays;
import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class Manager12 {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = Util.getTemplate("hibernateTemplate");
		List<Object[]> list = (List<Object[]>) hibernateTemplate.findByNamedQuery("q1");
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}

}
