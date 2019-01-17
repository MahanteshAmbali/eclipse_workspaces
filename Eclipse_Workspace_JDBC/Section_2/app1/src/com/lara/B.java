package com.lara;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class B {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = AUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "create table TAB2(name varchar(90), int age)";
			String s2 = "insert into TAB2 values('xyz', 33)";
			
			int i = stmt.executeUpdate(s1);
			int j = stmt.executeUpdate(s2);
			
			System.out.println(i +" , " +j);
		}
		
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
		finally
		{
			AUtil.closeStatement(stmt);
			AUtil.closeConnection(con);
		}
	}

}
