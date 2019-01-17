package org.hibernate.many_to_many;

import java.util.HashSet;
import java.util.Set;

public class Student {

	private int sId;
	private String firstName;
	private String lastName;
	
	private Set batches = new HashSet();

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
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

	public Set getBatches() {
		return batches;
	}

	public void setBatches(Set batches) {
		this.batches = batches;
	}
}
