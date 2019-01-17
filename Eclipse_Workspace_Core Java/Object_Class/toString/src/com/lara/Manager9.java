package com.lara;

class J{

	int x;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s1 =  super.toString();
		String s2 = "x= "+x;
		
		return s1+", "+s2;
	}
}

public class Manager9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		J j1 = new J();
		j1.x = 100;
		
		System.out.println(j1);
	}

}
