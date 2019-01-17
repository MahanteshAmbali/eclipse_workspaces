package org.hib.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON_TABLE_ANNOTATION")
public class Person {
	@Id
	@Column(name = "ID")
	private int personId;
	
	@Column(name = "FIRST_NAME")
	private String personFirstName;
	
	@Column(name = "Address")
	private String personAddress;
	private String personEducation;
	private int	personAge;
	private int personSalary;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonFirstName() {
		return personFirstName;
	}
	public void setPersonFirstName(String personFirstName) {
		this.personFirstName = personFirstName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public String getPersonEducation() {
		return personEducation;
	}
	public void setPersonEducation(String personEducation) {
		this.personEducation = personEducation;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public int getPersonSalary() {
		return personSalary;
	}
	public void setPersonSalary(int personSalary) {
		this.personSalary = personSalary;
	}
	
	@Override
	public String toString() {
		return "Id=" + personId +"\t" +
				", FirstName=" + personFirstName +"\t" + 
				", Address=" + personAddress + "\t" +
				", Education=" + personEducation + "\t" +
				", Age=" + personAge + "\t" +
				", Salary=" + personSalary +"\t" ;
	}
	
	
	
}
