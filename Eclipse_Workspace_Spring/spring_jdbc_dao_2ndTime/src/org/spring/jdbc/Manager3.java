package org.spring.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Manager3 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext =
				new ClassPathXmlApplicationContext("beans.xml");
		
		JdbcTemplate jdbcTemplate =  (JdbcTemplate) classPathXmlApplicationContext.getBean("jdbcTemplate");
		String sqlQuery = "insert into new_spring_jdbc values(2,'SPRING_JDBC_2')";
		jdbcTemplate.execute(sqlQuery);
		
		System.out.println("Done");
	}

}
