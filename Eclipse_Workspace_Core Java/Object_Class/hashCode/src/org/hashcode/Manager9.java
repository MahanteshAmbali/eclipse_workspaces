package org.hashcode;

class K{
	
	int i;
	int j;
	int k;
	
	public K(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash = 0;
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		String s3 = Integer.toString(k);
		
		return (hash = s1.hashCode() + s2.hashCode() + s3.hashCode());
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		K k1 = (K)arg0;
		if(k1 instanceof K){
			return ((this.i == k1.i) && (this.j == k1.j) && (this.k == k1.k));
		}
		
		return false;
	}
}

public class Manager9 {

	public static void main(String[] args) {
	
		K k1 = new K(10,20,30);
		K k2 = new K(10,20,30);
		
		System.out.println(k1.equals(k2));
		System.out.println(k2.equals(k1));
		
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
	}
}
