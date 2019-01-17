package com.lara.app2;

class P{
	
	int i;
	
	public P(int i){
		this.i = i;
	}
}

class Q{
	
	int i;
	public Q(int i){
		this.i = i;
	}
	
	@Override
	public boolean equals(Object arg0) {
		
		if(arg0 instanceof Q){
			return (((Q)arg0).i == this.i);
		}
		
		return false;
	}
}

class R{
	P param1;
	Q param2;
	String s1;
	Boolean b1;
	
	public R(P param1, Q param2, String s1, Boolean b1){
		this.param1 = param1;
		this.param2 = param2;
		this.s1 = s1;
		this.b1= b1;
	}
	
	@Override
	public boolean equals(Object arg0) {
		R r1 = (R)arg0;
		
		return (r1 instanceof R) && (r1.param1!= null) && (r1.param2 != null) && (r1.s1 != null) && 
				(r1.param1.i == param1.i) && (r1.param2.i == param2.i) && (r1.param2.equals(param1));
		
	}
}

public class Manager9 {
	public static void main(String[] args) {

		P p1 = new P(10);
		
		Q q1 = new Q(20);
		Q q2 = null;
		
		R r1 = new R(p1,q1,"abc", true);
		R r2 = new R(p1,q1,"abc", true);
		R r3 = new R(p1,q2,"abc", false);
		R r4 = new R(p1,q2,"xyz", true);
		R r5 = new R(p1,q2,null, true);
		R r6 = new R(p1,q2,null, true);
		
		System.out.println(r1.equals(r5));
	}

}
