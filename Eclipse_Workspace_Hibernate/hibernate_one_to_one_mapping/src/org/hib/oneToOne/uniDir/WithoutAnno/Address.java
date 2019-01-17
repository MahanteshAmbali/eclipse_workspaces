package org.hib.oneToOne.uniDir.WithoutAnno;

public class Address {

	private int addressId;
	private String houseNo;
	private String streetName;
	private Student student;
	
	public int getAddressId() {
		System.out.println("Get AddressID()");
		return addressId;
	}
	public void setAddressId(int addressId) {
		System.out.println("Set Address Id()");
		this.addressId = addressId;
	}
	public String getHouseNo() {
		System.out.println("Get HouseNo()");
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		System.out.println("Set HouseNo()");
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		System.out.println("Get StreetName()");
		return streetName;
	}
	public void setStreetName(String streetName) {
		System.out.println("Set StreetName()");
		this.streetName = streetName;
	}
	public Student getStudent() {
		System.out.println("Get Student()");
		return student;
	}
	public void setStudent(Student student) {
		System.out.println("Set Student()");
		this.student = student;
	}
}
