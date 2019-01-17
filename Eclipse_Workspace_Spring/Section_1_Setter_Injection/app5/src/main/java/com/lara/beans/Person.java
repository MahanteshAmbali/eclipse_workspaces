package com.lara.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person 
{
	private String firstName;
	private int age;
	private double weight;
	private String[] mails;
	private List mobiles;
	private Set loverNames;
	private Map education;
	private Properties project;
	private Address permanentAddress;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set getLoverNames() {
		return loverNames;
	}
	public void setLoverNames(Set loverNames) {
		this.loverNames = loverNames;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String[] getMails() {
		return mails;
	}
	public void setMails(String[] mails) {
		this.mails = mails;
	}
	public List getMobiles() {
		return mobiles;
	}
	public void setMobiles(List mobiles) {
		this.mobiles = mobiles;
	}
	
	public Map getEducation() {
		return education;
	}
	public void setEducation(Map education) {
		this.education = education;
	}
	public Properties getProject() {
		return project;
	}
	public void setProject(Properties project) {
		this.project = project;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	
}
