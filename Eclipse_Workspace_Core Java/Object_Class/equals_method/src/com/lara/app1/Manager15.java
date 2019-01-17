package com.lara.app1;

class O{
	
	String s1;
}

public class Manager15 {

	public static void main(String[] args) {
		
		O o1 = new O();
		o1.s1 = "Mahantesh";
		
		O o2 = new O();
		o2.s1 = "Mahantesh";
		
		O o3 = o2;
		
		System.out.println(o1 == o2);
		System.out.println(o2 == o3);
		System.out.println(o3 == o2);
		System.out.println(o3 == o1);
	}

}
