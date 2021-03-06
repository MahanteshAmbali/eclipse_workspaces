package org.hib.oneToMany;

public class Employee {

	private int empId;
	private String firstName;
	private String lastName;
	
	private AccountNumber[] accountNumbers;

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

	public AccountNumber[] getAccountNumbers() {
		return accountNumbers;
	}

	public void setAccountNumbers(AccountNumber[] accountNumbers) {
		this.accountNumbers = accountNumbers;
	}

}
