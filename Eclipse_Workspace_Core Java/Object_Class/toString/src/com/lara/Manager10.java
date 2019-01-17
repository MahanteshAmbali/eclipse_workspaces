package com.lara;

class Person{
	
	String name;
	int age;
	
	@Override
	public String toString() {
		
		return "Name: "+name+", Age: "+age;
	}
}

public class Manager10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		person1.name = "Mahantesh";
		person1.age = 29;
		
		System.out.println(person1);
	}
}
