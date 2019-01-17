package com.lara;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

class PersonDAOImpl implements PersonDAO 
{
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void create(Person person)
	{
	  String sql="insert into person(firstname,lastname) values(?,?)";
	  Object[] params=new Object[]{person.getFirstName(),person.getLastName()};
	  this.getJdbcTemplate().update(sql, params);
	  System.out.println("values can added successfully");
	
		
	}

	@Override
	public List<Person> getAllPerson() 
	{
		
		return this.getJdbcTemplate().query("select * from person", new PersonRowMapper());
	}

	@Override
	public Person getPerson(int id) 
	{
		String sql="select * from person where id=?";
		Object[] params=new Object[]{id};
		final Person person=new Person();
		this.getJdbcTemplate().query(sql,params,new RowCallbackHandler(){
			
		
			public void processRow(ResultSet rs) throws SQLException 
			{
			   person.setId(rs.getInt("id"));
			   person.setFirstName(rs.getString("firstname"));
			   person.setLastName(rs.getString("lastname"));
				
			}
		}
		);
		return person;
	}

}
