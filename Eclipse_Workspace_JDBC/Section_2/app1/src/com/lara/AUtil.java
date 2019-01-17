package com.lara;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class AUtil  
{
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static
	{
		FileReader fi = null;
		Properties pr = new Properties();
		
		try
		{
			fi = new FileReader("db-constants.properties");
			pr.load(fi);
			driver = pr.getProperty("driver");
			url = pr.getProperty("url");
			username = pr.getProperty("username");
			password = pr.getProperty("password");
		}
		
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		finally
		{
			try
			{
				if(fi!= null)
				{
					fi.close();
					fi = null;
				}
			}
			
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	static
	{
		try
		{
			Class.forName(driver);
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	public static Connection getConnection()throws SQLException
	{
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	
	public static void closeResultSet(ResultSet rs)
	{
		try
		{
			if(rs!= null)
			{
				rs.close();
				rs = null;
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void closeStatement(Statement stmt)
	{
		try
		{
			if(stmt!= null)
			{
				stmt.close();
				stmt = null;
			}
		}
		
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void closeConnection(Connection con)
	{
		try
		{
			if(con!= null)
			{
				con.close();
				con = null;
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
