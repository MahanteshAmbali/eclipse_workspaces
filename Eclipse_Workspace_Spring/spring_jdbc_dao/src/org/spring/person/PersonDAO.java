package org.spring.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public interface PersonDAO {

	/*private JdbcTemplate jdbcTemplate;
	
	public void jdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setup(){
		String sql = "create table spring_jdbc_table_4(sno int, name varchar(90), age int)";
		jdbcTemplate.execute(sql);
	}
	
	public void save(int sno, String fName, int age){
		String sql = "insert into spring_jdbc_table_4 values("+sno+",'"+fName+"',"+age+")";
		jdbcTemplate.update(sql);
	}
	
	public void delete(int sno){
		String sql = "delete from spring_jdbc_table_4 where sno="+sno;
		jdbcTemplate.update(sql);
	}
	
	public void update(String fName, int age){
		String sql = "update spring_jdbc_table_4 set name="+"'fName'"+", age = "+age;
		jdbcTemplate.update(sql);
	}
	
	public List<Map<String, Object>> read(int sno){
		String sql = "select * from spring_jdbc_table_4 where sno = "+sno;
		return new ArrayList<Map<String, Object>>(jdbcTemplate.queryForList(sql));
	}
	
	public List<Map<String, Object>> readAll(){
		String sql = "select * from spring_jdbc_table_4";
		return new ArrayList<Map<String, Object>>(jdbcTemplate.queryForList(sql));
	}*/
	
	public void setup();
	
	public void save(int sno, String fName, int age);
	
	public void delete(int sno);
	
	public void update(String fName, int age);
	
	public List<Map<String, Object>> read(int sno);
	
	public List<Map<String, Object>> readAll();
	
}
