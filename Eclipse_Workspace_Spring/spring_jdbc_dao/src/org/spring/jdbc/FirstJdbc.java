package org.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FirstJdbc {

	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "spring_jdbc", "spring_jdbc");
		Statement stmt = con.createStatement();
		String sql = "create table second_table (id int, f_name varchar(90), l_name varchar(90))";
		stmt.execute(sql);
		
		System.out.println("Done");
	}

}
