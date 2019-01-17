package org.spring.employee;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void setup() {
		String sql = "create table Employee_Spring_Jdbc(EMP_ID int, EMP_F_NAME varchar(90), EMP_L_NAME varchar(90), EMP_AGE int)";
		jdbcTemplate.execute(sql);
	}

	@Override
	public void insert(Employee employee) {
		String sql = "insert into Employee_Spring_Jdbc values("+employee.getEmployeeId()+",'"+employee.getEmployeeFirstName()+"', '"+
						employee.getEmployeeLastName()+"', "+employee.getEmployeeAge()+")";
		jdbcTemplate.execute(sql);
	}

	@Override
	public void update(Employee employee) {
		String sql = "update Employee_Spring_Jdbc set emp_f_name = '"+employee.getEmployeeFirstName()+"',emp_l_name = '"+employee.getEmployeeLastName()+"', emp_age = "+employee.getEmployeeAge()+" where emp_id = "+employee.getEmployeeId();
		
		jdbcTemplate.update(sql);
	}

	@Override
	public void delete(Employee employee) {
		String sql = "delete from Employee_Spring_Jdbc where emp_id = "+employee.getEmployeeId();
		jdbcTemplate.execute(sql);
	}

	@Override
	public Employee read(int empId) {
		String sql = "select * from Employee_Spring_Jdbc where emp_id = "+empId;
		List<Employee> list = jdbcTemplate.query(sql, new EmployeeRowMapper());
		return list.get(0);
	}

	@Override
	public List<Employee> readAll() {
		
		String sql = "select * from Employee_Spring_Jdbc";
		List<Employee> list = jdbcTemplate.query(sql, new EmployeeRowMapper());
		return list;
	}
}
