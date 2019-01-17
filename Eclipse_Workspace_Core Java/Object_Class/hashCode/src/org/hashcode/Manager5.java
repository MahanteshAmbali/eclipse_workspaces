package org.hashcode;

class E{
	
	public int i;
	public String s1;
	public char k;
	public boolean m;
	
	public E(int i, String s1, char k, boolean m){
		this.i = i;
		this.s1 = s1;
		this.k = k;
		this.m = m;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		String s1 = Integer.toString(i);
		String s2 = Character.toString(k);
		String s3 = Boolean.toString(m);
		
		int hash = s1.hashCode();
		hash = hash + s2.hashCode();
		hash = hash + s3.hashCode();
		hash = hash + s1.hashCode();
		
		return hash;
	}
}

public class Manager5 {

	public static void main(String[] args) {

		E e1 = new E(10, "mant", 'a', true);
		E e2 = new E(10, "mant", 'a', true);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
