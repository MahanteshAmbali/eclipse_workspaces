package org.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class Manager4 {

	public static void main(String[] args) {

		JdbcTemplate jdbcTemplate = Util.getJdbcTemplate("jdbcTemplate");
		String sqlQuery = "insert into new_spring_jdbc values(3,'DELL_SPRING_JDBC')";
		jdbcTemplate.execute(sqlQuery);
		
		System.out.println("Done");
	}

}
