package org.spring.hib.crud;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "EmpId=" + empId + ", FirstName=" + firstName
				+ ", LastName=" + lastName;
	}
	
	
}
