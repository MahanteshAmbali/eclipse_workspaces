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
		
		String sql = "insert into new_spring_jdbc values(1, 'Spring_JDBC')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
		jdbcTemplate.execute(sql);
		
		System.out.println("Done");
	}
}
