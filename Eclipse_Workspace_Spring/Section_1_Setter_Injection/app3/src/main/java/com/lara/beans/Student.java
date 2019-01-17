package com.lara.beans;

import java.util.List;

public class Student 
{
	private String firstName;
	private double weight;
	private List mails;
	
	public Student()
	{
		System.out.println("Student()");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public List getMails() {
		return mails;
	}

	public void setMails(List mails) {
		this.mails = mails;
	}
}
