package org.objectClass;

class Company {
	private int companyId;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + "]";
	}

}

class Employee implements Cloneable{
	private int empId;
	private String firstName;
	private String lastName;
	
	private Company company;
	
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
	
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "empId=" + empId + ", firstName=" + firstName
				+ ", lastName=" + lastName;
	}
	@Override
	public int hashCode() {
		
		int hashNum = 0;
		String s1 = Integer.toString(empId);
		hashNum = s1.hashCode();
		hashNum = hashNum + firstName.hashCode();
		hashNum = hashNum + lastName.hashCode();
		
		return hashNum;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize");
		super.finalize();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class ToString {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		Company company = new Company();
		company.setCompanyId(222);
		
		employee.setEmpId(1);
		employee.setFirstName("DELL");
		employee.setLastName("DELL");
		employee.setCompany(company);
		
		System.out.println(employee);
		
		System.out.println(employee.hashCode());
		
		
		System.gc();
		
		Employee employee2 = null;
		employee2 = (Employee) employee.clone();
		
		System.out.println(employee2.getEmpId());
		System.out.println(employee2.getFirstName());
		System.out.println(employee2.getLastName());
		System.out.println(employee2.getCompany());
		
		Company company2 = new Company();
		company2.setCompanyId(333);
		employee2.setCompany(company2);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getCompany());
	}
}