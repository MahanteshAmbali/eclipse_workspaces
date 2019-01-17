package com.lara.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee 
{
	private String firstName;
	private int age;
	private Double weight;
	private String[] mails;
	private List mobileNos;
	private Set loverNames;
	private Map education;
	private Properties project;
	private Address permanentAddress;
	
	public Employee(String firstName, int age, Double weight, String[] mails,
					List mobileNos, Set loverNames, Map education,Properties project, Address permanentAddress)
	{
		this.firstName = firstName;
		this.age = age;
		this.weight = weight;
		this.mails = mails;
		this.mobileNos = mobileNos;
		this.loverNames = loverNames;
		this.education = education;
		this.project = project;
		this.permanentAddress = permanentAddress;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public int getAge() {
		return age;
	}
	public Double getWeight() {
		return weight;
	}
	public String[] getMails() {
		return mails;
	}
	public List getMobileNos() {
		return mobileNos;
	}
	public Set getLoverNames() {
		return loverNames;
	}
	public Map getEducation() {
		return education;
	}
	public Properties getProject() {
		return project;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	
	
}
