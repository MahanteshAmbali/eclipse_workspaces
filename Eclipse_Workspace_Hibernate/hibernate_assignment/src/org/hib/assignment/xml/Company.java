package org.hib.assignment.xml;

public class Company {

	private int companyId;
	private String companyName;
	private String companyAddress;
	private String companyStreetName;
	
	private Project project;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyStreetName() {
		return companyStreetName;
	}

	public void setCompanyStreetName(String companyStreetName) {
		this.companyStreetName = companyStreetName;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
}
