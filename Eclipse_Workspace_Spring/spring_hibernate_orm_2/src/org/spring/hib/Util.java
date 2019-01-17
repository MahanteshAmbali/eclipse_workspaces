package org.spring.hib;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class Util {

	private static ClassPathXmlApplicationContext context = null;
	
	static{
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	public static HibernateTemplate getTemplate(String template){
		return (HibernateTemplate)context.getBean(template);
	}
}
