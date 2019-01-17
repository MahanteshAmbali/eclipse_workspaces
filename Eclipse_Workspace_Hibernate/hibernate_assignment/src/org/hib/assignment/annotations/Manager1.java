package org.hib.assignment.annotations;

import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		
		Education education = new Education();
		education.setDegreeName("BE");
		education.setYearOfPassing("2008");
		
		Address address = new Address();
		address.setHouseNumber("140/B");
		address.setStreetName("BTM 2nd Stage");
		
		Employee employee = new Employee();
		employee.setFirstName("Mahantesh");
		employee.setLastName("Ambali");
		employee.setAddress(address);
		employee.setEducation(education);
		
		Project project = new Project();
		project.setProjectTitle("Clean Bangalore");
		project.setProjectCustomerName("BBMP");
		project.setProjectDuration(200);
		project.setEmployee(employee);
		
		Company company = new Company();
		company.setCompanyId(2);
		company.setCompanyName("IBM");
		company.setCompanyStreetName("Bannerghatta");
		company.setCompanyAddress("Bangalore");
		
		company.setProject(project);
		
		session.beginTransaction();
		session.save(company);
		if(session.contains(company)){
			System.out.println(true);
		}
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		System.out.println("Done");
	}

}
