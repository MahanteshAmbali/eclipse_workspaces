package org.hib.polymorphic;

public class PermanentEmployee extends Employee{

	private String peDesignation;
	private double peSalary;
	
	public String getPeDesignation() {
		return peDesignation;
	}
	public void setPeDesignation(String peDesignation) {
		this.peDesignation = peDesignation;
	}
	public double getPeSalary() {
		return peSalary;
	}
	public void setPeSalary(double peSalary) {
		this.peSalary = peSalary;
	}
	
	
}
