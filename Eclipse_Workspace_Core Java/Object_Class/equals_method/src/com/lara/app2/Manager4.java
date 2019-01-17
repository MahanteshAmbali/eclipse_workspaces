package com.lara.app2;

class H{
	
	int x;
	
	public H(int x){
		this.x = x;
	}
	
	@Override
	public boolean equals(Object arg0) {
		
		return (arg0 instanceof H) && (((H)arg0).x == this.x);
	}
}

class I{
	
	int y;
	
	public I(int y){
		this.y = y;
	}
	
	@Override
	public boolean equals(Object arg0) {
		return (arg0 instanceof I) && (((I)arg0).y == this.y);
	}
}

public class Manager4 {

	public static void main(String[] args) {
	
		H h1 = new H(100);
		I i1 = new I(100);
		
		H h2 = new H(100);
		I i2 = new I(100);
		
		System.out.println(h1.equals(h2));
		System.out.println(i1.equals(h1));

		System.out.println(h2.equals(i2));
		System.out.println(i2.equals(h1));
}
}
