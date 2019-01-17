package org.spring.employee;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public interface EmployeeDAO {
	
	public void setup();
	
	public void insert(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Employee employee);
	
	public List<Employee> read(String empId);
	
	public List<Employee> readAll();
}
