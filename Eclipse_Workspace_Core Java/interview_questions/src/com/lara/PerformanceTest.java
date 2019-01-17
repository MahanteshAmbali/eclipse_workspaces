package com.lara;

import java.util.ArrayList;
import java.util.List;

class Person{
	
	private int id;
	private String fName;
	private String lName;
	
	public Person(int id, String fName, String lName){
		this.id = id;
		this.fName = fName;
		this.lName = lName;
	}
}
public class PerformanceTest {

	private static final long MEGABYTE = 1024L * 1024L;
	
	private static double bytesToMegabytes(double bytes){
		return bytes/MEGABYTE;
	}
	
	
	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		System.out.println(bytesToMegabytes(runtime.totalMemory()));
		
		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i < 100000; i++) {
			list.add(new Person(1, "MAHANTESH", "AMBALI"));
		}
		
		runtime.gc();
		double memory = runtime.totalMemory() - runtime.freeMemory();
	
		System.out.println("Used memory in bytes is: "+memory);
		System.out.println("Used memory in MB is: "+bytesToMegabytes(memory));
	}

}
