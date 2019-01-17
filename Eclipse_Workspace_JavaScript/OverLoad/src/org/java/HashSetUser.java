package org.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee{
	private int id;
	private String fName;
	private String lName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (id != other.id)
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		return true;
	}
	
	
	
}
public class HashSetUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setfName("Dell");
		employee1.setlName("Lara");
		
		Employee employee2 = new Employee();
		employee2.setId(1);
		employee2.setfName("Dell");
		employee2.setlName("Lara");
		
		Set set = new HashSet();
		set.add(employee1);
		set.add(employee2);
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			Employee employee = (Employee)it.next();
			System.out.println("====================");
			System.out.println(employee.getId());
			System.out.println(employee.getfName());
			System.out.println(employee.getlName());
			System.out.println("====================");
		}
	}

}
