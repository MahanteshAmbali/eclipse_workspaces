package org.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Manager2 {

	public static void main(String[] args) {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("spring_jdbc");
		ds.setPassword("spring_jdbc");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(ds);
		jdbcTemplate.update("insert into second_table values(0001, 'Mahantesh', 'Ambali')");
		
		System.out.println("Done");
	}

}
