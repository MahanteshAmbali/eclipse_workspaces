package com.lara.app1;

class U{
	
	double j;
	
	public U(double j){
		this.j = j;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		boolean flag  = ((U)arg0).j == this.j;
		return flag;
	}
}

public class Manager21 {

	public static void main(String[] args) {
		
		U u1 = new U(89.90);
		U u2 = new U(89.90);
		
		System.out.println(u1.equals(u2));
	}

}
