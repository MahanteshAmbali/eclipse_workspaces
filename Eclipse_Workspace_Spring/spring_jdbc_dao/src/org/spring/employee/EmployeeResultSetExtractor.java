package org.spring.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeResultSetExtractor implements ResultSetExtractor<Employee>{

	@Override
	public Employee extractData(ResultSet arg0) throws SQLException,
			DataAccessException {
		Employee employee = new Employee();
		employee.setEmpId(arg0.getString("empId"));
		employee.setfName(arg0.getString("fName"));
		employee.setlName(arg0.getString("lName"));
		employee.setAge(arg0.getString("age"));
		return employee;
	}
}