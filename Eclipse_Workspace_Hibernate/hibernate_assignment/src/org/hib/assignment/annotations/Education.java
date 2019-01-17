package org.hib.assignment.annotations;

import javax.persistence.Embeddable;

@Embeddable
public class Education {

	private String degreeName;
	private String yearOfPassing;
	
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	public String getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	
	
}
