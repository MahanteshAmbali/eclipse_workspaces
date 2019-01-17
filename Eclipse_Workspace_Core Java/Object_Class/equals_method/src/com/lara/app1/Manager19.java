package com.lara.app1;

class S{
	
	double d;
	
	public S(double d){
		this.d = d;
	}
}

public class Manager19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		S s1 = new S(10.9);
		S s2 = new S(100.9);
		S s3 = s2;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
		System.out.println(s3==s1);
		System.out.println(s3.equals(s1));
	}
}
