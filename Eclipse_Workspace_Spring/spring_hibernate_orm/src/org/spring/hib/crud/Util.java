package org.spring.hib.crud;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class Util {

	private static ClassPathXmlApplicationContext context ;
	
	static{
		context = new ClassPathXmlApplicationContext("Beans.xml");
	}
	
	public static EmployeeDAOImpl getTemplate(String template){
		return (EmployeeDAOImpl)context.getBean(template);
	}
}
