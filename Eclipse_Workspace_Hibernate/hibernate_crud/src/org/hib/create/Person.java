package org.hib.create;

class A{
	
}

abstract class B extends A{
	
}


public final class Person extends B{

	private int pid;
	private String fName;
	private String lName;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	
	
}
