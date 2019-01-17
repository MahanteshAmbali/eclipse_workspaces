package org.spring.employee;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		// TODO Auto-generated method stub
		this.jdbcTemplate = jdbcTemplate;
		
	}
	
	@Override
	public void setup() {
		String sql = "create table spring_jdbc_table_5(EMP_ID varchar(90), EMP_F_NAME varchar(90), EMP_L_NAME varchar(90), EMP_AGE varchar(90))";
		jdbcTemplate.execute(sql);
	}

	@Override
	public void insert(Employee employee) {

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("insert into spring_jdbc_table_5 values(");
		stringBuffer.append("'"+employee.getEmpId()+"',");
		stringBuffer.append("'"+employee.getfName()+"',");
		stringBuffer.append("'"+employee.getlName()+"',");
		stringBuffer.append("'"+employee.getAge()+"')");
		jdbcTemplate.update(stringBuffer.toString());
	}

	@Override
	public void update(Employee employee) {

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("update spring_jdbc_table_5 set");
		stringBuffer.append("fName='"+employee.getfName()+"',");
		stringBuffer.append("lName='"+employee.getlName()+"',");
		stringBuffer.append("age='"+employee.getAge()+"')");
		jdbcTemplate.update(stringBuffer.toString());
	}

	@Override
	public void delete(Employee employee) {

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("delete from spring_jdbc_table_5 ");
		stringBuffer.append("where empId='"+employee.getEmpId()+"'");
		jdbcTemplate.execute(stringBuffer.toString());
	}

	@Override
	public List<Employee> read(String empId) {
		String sql = "select * from spring_jdbc_table_5 where empId='"+empId+"'";
		List<Employee> list = jdbcTemplate.query(sql, new EmployeeRowMapper());
		return list;
	}

	@Override
	public List<Employee> readAll() {

		String sql = "select * from spring_jdbc_table_5";
		List<Employee> list = jdbcTemplate.query(sql, new EmployeeRowMapper());
		return list;
	}
}
