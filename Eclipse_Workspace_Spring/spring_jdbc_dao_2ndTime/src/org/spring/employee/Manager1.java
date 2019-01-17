package org.spring.employee;

public class Manager1 {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setEmployeeId(1);
		employee1.setEmployeeFirstName("Mahantesh");
		employee1.setEmployeeLastName("Ambali");
		employee1.setEmployeeAge(23);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(2);
		employee2.setEmployeeFirstName("Sagar");
		employee2.setEmployeeLastName("Dell");
		employee2.setEmployeeAge(23);
		
		Employee employee3 = new Employee();
		employee3.setEmployeeId(3);
		employee3.setEmployeeFirstName("Hello");
		employee3.setEmployeeLastName("World");
		employee3.setEmployeeAge(256);
		
		EmployeeDAOImpl employeeDAOImpl = Util.getTemplate("employeeDAOImpl");
		
		//employeeDAOImpl.setup();
		
//		employeeDAOImpl.insert(employee1);
//		employeeDAOImpl.insert(employee2);
//		employeeDAOImpl.insert(employee3);
		
	//	employeeDAOImpl.update(employee3);
		
		//employeeDAOImpl.delete(employee3);
		
		//employeeDAOImpl.read(1);
		
		employeeDAOImpl.readAll();
		
		System.out.println("Done");
	}

}
