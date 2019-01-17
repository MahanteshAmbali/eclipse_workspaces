package org.spring.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet arg0, int arg1) throws SQLException {

		EmployeeResultSetExtractor empResultSetExtractor = 
				new EmployeeResultSetExtractor();
		Employee employee = empResultSetExtractor.extractData(arg0);
		
		return employee;
	}
}
