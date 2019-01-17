package org.hashcode;

class H{

	int i, j;
	
	public H(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i + ", j: "+j;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		H h1 = (H)arg0;
		if((h1 instanceof H) && (h1.i == this.i) && (this.j == h1.j)){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		
		int hash = s1.hashCode() + s2.hashCode();
		
		return hash;
	}
}

public class Manager7 {

	public static void main(String[] args) {
		
		H a1 = new H(10, 20);
		H a2 = new H(20, 10);
		H a3 = new H(10, 20);
		H a4 = new H(20, 20);
		
		System.out.println(a1);		
		System.out.println(a2);		
		System.out.println(a3);		
		System.out.println(a4);
		
		System.out.println("-----------");
		
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a4));
		System.out.println(a1.equals(a3));
		System.out.println(a3.equals(a1));
		
		System.out.println("-----------");
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
	}
}