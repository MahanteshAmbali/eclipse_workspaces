package org.hib.polymorphic;

import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		session.beginTransaction();
		
		Person person = new Person();
		person.setpId(1);
		person.setfName("Mahantesh");
		person.setlName("Ambali");
		
		Employee employee = new Employee();
		employee.setpId(2);
		employee.setfName("Mahantesh");
		employee.setlName("Ambali");
		employee.setEmployeeAddress("BTM 2ND Stage");
		employee.setEmployeeEmailId("mahantesh378@gmail.com");
		
		PermanentEmployee permanentEmployee = 
				new PermanentEmployee();
		permanentEmployee.setpId(3);
		permanentEmployee.setfName("Mahantesh");
		permanentEmployee.setlName("Ambali");
		permanentEmployee.setEmployeeAddress("BTM 2ND Stage");
		permanentEmployee.setEmployeeEmailId("mahantesh378@gmail.com");
		permanentEmployee.setPeDesignation("SSE");
		permanentEmployee.setPeSalary(45920.242);
		
		//session.save(person);
		//session.save(employee);
		session.save(permanentEmployee);
		
		session.getTransaction().commit();
		
		System.out.println("Done");
		
	}

}
