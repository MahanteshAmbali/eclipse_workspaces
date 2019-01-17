package org.spring.person;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Util {

	private static ClassPathXmlApplicationContext context ;
	
	static{
		context = new ClassPathXmlApplicationContext("Beans.xml");
	}
	
	public static JdbcTemplate getTemplate(String template){
		return (JdbcTemplate)context.getBean(template);
	}
}
