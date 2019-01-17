package org.spring.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Util {

	private static ClassPathXmlApplicationContext context = null;
	
	static{
		
		context = new ClassPathXmlApplicationContext("Beans.xml");
	}
	
	public static EmployeeDAOImpl getTemplate(String template){
		return (EmployeeDAOImpl) context.getBean(template);
	}
}
