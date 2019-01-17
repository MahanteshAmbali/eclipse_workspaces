package com.lara.app1;

class W{
	
	int i, j;
	double k, m;
	
	public W(int i, int j, double k, double m){
		this.i = i;
		this.j = j;
		this.k = k;
		this.m = m;
	}
	
	@Override
	public boolean equals(Object arg0){
		
		W w1 = (W)arg0;
		boolean flag = (w1.i == this.i && w1.j == this.j && w1.k == this.k && w1.m == this.m);		
		return flag;
	}
}

public class Manager23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		W w1 = new W(10, 20, 30.40, 50.60);
		W w2 = new W(10, 20, 30.40, 50.60);
		W w3 = new W(10, 20, 30.50, 50.60);		
		
		System.out.println(w1.equals(w2));
		System.out.println(w2.equals(w3));
	}

}
