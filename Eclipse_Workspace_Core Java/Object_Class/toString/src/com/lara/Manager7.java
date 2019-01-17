package com.lara;

class G{

	int i, j;
	
	public G(int i, int j) {
		
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i value is: "+i + " j value is: "+j;
	}
}

public class Manager7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		G g1 = new G(10,20);
		System.out.println(g1);
		
		g1.i = 30;
		g1.j = 40;
		System.out.println(g1);
	}
}
