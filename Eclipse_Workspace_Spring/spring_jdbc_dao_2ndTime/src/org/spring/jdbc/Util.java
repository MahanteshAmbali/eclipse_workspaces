package org.spring.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Util {
	
	private static ClassPathXmlApplicationContext context = null;
	
	static{
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	public static JdbcTemplate getJdbcTemplate(String template){
		return (JdbcTemplate) context.getBean(template);
	}
}
