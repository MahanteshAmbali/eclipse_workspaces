package org.hib.oneToOne.uniDir.WithoutAnno;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	
	public int getId() {
		System.out.println("Get ID()");
		return id;
	}
	public void setId(int id) {
		System.out.println("Set ID()");
		this.id = id;
	}
	public String getFirstName() {
		System.out.println("Get FirstName()");
		return firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println("Set FirstName()");
		this.firstName = firstName;
	}
	public String getLastName() {
		System.out.println("Get LastName()");
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("Set LastName()");
		this.lastName = lastName;
	}
	
	
}
