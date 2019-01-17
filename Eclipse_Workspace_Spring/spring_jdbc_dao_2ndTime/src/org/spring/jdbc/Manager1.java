package org.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Manager1 {

	public static void main(String[] args) throws Exception{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring_jdbc", "spring_jdbc");
		Statement statement = connection.createStatement();
		String sql = "create table new_spring_jdbc(id int, name varchar(90))";
		statement.execute(sql);
		
		System.out.println("Done");
	}
}
