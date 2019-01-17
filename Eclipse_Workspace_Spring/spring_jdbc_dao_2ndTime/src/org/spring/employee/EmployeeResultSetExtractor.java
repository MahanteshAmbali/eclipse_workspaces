package org.spring.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeResultSetExtractor implements ResultSetExtractor<Employee> {

	@Override
	public Employee extractData(ResultSet arg0) throws SQLException,
			DataAccessException {
		
		Employee employee = new Employee();
		employee.setEmployeeId(arg0.getInt("employeeId"));
		employee.setEmployeeFirstName(arg0.getString("employeeFirstName"));
		employee.setEmployeeLastName(arg0.getString("employeeLastName"));
		employee.setEmployeeAge(arg0.getInt("employeeAge"));
		return employee;
	}
}
