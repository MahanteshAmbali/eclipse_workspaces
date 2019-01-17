package org.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class Manager4 {

	public static void main(String[] args) {

		JdbcTemplate jdbcTemplate = Util.getTemplate("sampleJDBCTemplate");
		String sql = "insert into SPRING_JDBC_TABLE_3 values(001, 'Mahantesh')";
		jdbcTemplate.execute(sql);
		System.out.println("Done");
	}

}
