package org.spring.hib.crud;

public interface EmployeeDAO {

	public void createEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public Employee readEmployee(int empId);
	
	public void readAllEmployees();
	
	public void deleteEmployee(Employee employee);
	
}
