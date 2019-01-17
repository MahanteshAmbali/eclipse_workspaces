package org.hib.assignment.annotations;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String houseNumber;
	private String streetName;
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	
}
