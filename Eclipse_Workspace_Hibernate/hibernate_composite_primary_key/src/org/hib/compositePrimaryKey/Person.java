package org.hib.compositePrimaryKey;

public class Person {

	private String personFirstName;
	private String personLastName;
	private int age;
	
	private PersonPK personPK;

	public String getPersonFirstName() {
		return personFirstName;
	}

	public void setPersonFirstName(String personFirstName) {
		this.personFirstName = personFirstName;
	}

	public String getPersonLastName() {
		return personLastName;
	}

	public void setPersonLastName(String personLastName) {
		this.personLastName = personLastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PersonPK getPersonPK() {
		return personPK;
	}

	public void setPersonPK(PersonPK personPK) {
		this.personPK = personPK;
	}
	
	
}
