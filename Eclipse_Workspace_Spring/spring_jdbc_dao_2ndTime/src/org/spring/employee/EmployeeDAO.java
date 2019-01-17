package org.spring.employee;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {

	public void setup();
	
	public void insert(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Employee employee);
	
	public Employee read(int empId);
	
	public List<Employee> readAll();
}
