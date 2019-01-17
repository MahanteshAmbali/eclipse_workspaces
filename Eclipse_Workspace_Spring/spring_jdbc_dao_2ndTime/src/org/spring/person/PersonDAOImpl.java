package org.spring.person;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDAOImpl implements PersonDAO {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate template){
		this.jdbcTemplate = template;
	}
	
	@Override
	public void setup() {

		String sql = "create table Person_Spring_Jdbc(id int, name varchar(90), age int)";
		jdbcTemplate.execute(sql);
	}

	@Override
	public void save(int id, String name, int age) {

		String sql = "insert into Person_Spring_Jdbc values("+id+", '"+name+"', "+age+")";
		jdbcTemplate.execute(sql);
	}

	@Override
	public void update(int id, String name, int age) {

		String sql = "update Person_Spring_Jdbc set name = '"+name+"', age = "+age+" where id = "+id+"";
		jdbcTemplate.update(sql);
	}

	@Override
	public void delete(int id) {

		String sql = "delete from Person_Spring_Jdbc where id = "+id;
		jdbcTemplate.execute(sql);
	}

	@Override
	public List<Map<String, Object>> read(int id) {

		String sql = "select name, age from Person_Spring_Jdbc where id = "+id;
		List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
		return list;
	}

	@Override
	public List<Map<String, Object>> readAll() {

		String sql = "select * from Person_Spring_Jdbc";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return list;
	}

}
