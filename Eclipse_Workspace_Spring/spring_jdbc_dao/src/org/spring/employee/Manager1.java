package org.spring.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager1 {
	
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmpId("0");
		employee.setfName("Mahantesh");
		employee.setlName("Ambali");
		employee.setAge("20");
		
		Employee employee1 = new Employee();
		employee1.setEmpId("1");
		employee1.setfName("Mahantesh");
		employee1.setlName("Ambali");
		employee1.setAge("20");
		/*
		EmployeeDAOImpl employeeDAOImpl = (EmployeeDAOImpl)Util.getTemplate("empDao");
		employeeDAOImpl.setup();*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeDAOImpl employeeDAOImpl = (EmployeeDAOImpl) context.getBean("empDao");
		//employeeDAOImpl.setup();
		
		
//		employeeDAOImpl.insert(employee);
//		employeeDAOImpl.insert(employee1);
		
		employeeDAOImpl.delete(employee1);
		
		System.out.println("Done");
	}

}
