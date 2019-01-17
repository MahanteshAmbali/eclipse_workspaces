package org.spring.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Manager3 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
		JdbcTemplate template = (JdbcTemplate)context.getBean("sampleJDBCTemplate");
		String sql = "create table Spring_Jdbc_Table_3(id int, f_name varchar(90))";
		template.execute(sql);
		
		System.out.println("Done");
		
	}

}
