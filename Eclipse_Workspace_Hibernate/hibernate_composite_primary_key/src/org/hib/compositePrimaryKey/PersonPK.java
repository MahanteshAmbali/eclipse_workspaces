package org.hib.compositePrimaryKey;

import java.io.Serializable;

public class PersonPK implements Serializable{

	private int personId;
	private String personMailId;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonMailId() {
		return personMailId;
	}
	public void setPersonMailId(String personMailId) {
		this.personMailId = personMailId;
	}
	
	
}
