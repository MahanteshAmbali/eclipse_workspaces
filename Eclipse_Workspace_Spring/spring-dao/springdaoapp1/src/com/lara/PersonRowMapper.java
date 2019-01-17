package com.lara;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int line) throws SQLException 
	{
		Person person=new Person();
		person.setId(rs.getInt("Id"));
		person.setFirstName(rs.getString("firstName"));
		person.setLastName(rs.getString("lastName"));
		return person;
	}

}
