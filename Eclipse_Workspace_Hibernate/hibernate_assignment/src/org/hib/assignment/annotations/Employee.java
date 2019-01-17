package org.hib.assignment.annotations;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Employee {

	private String firstName;
	private String lastName;
	@Embedded
	private Education education;
	@Embedded
	private Address address;
	
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
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
