package org.spring.hib.crud;

import java.util.Scanner;

public class Manager1 {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee employee = new Employee();
//		System.out.println("Input ID, FirstName, LastName");
//		employee.setEmpId(scanner.nextInt());
//		employee.setFirstName(scanner.next());
//		employee.setLastName(scanner.next());
		
		
		EmployeeDAOImpl emImpl = (EmployeeDAOImpl) Util.getTemplate("empDaoImpl");
		
//		Employee employee2 = new Employee();
//		employee2.setEmpId(1);
//		employee2.setFirstName("Mahantesh");
//		employee2.setLastName("Ambali");
		
	//	emImpl.createEmployee(employee);
		
	//	EmployeeDAOImpl emImpl = (EmployeeDAOImpl) Util.getTemplate("empDaoImpl");
		emImpl.readAllEmployees();
		
	//	emImpl.deleteEmployee(employee2);
		
		System.out.println("Done");
	}

}
