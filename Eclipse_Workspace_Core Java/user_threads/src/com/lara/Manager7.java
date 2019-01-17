package com.lara;

class N{
	int i, j;
	N(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i= "+i+", j= "+j;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		
		int hash = s1.hashCode() + s2.hashCode();
		
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		if(!(obj instanceof N)){
			return flag;
		}
		
		flag = ((this.i == ((N)obj).i) && (this.j == ((N)obj).j));
		return flag;
	}
}
public class Manager7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N n1 = new N(10,20);
		N n2 = new N(20,10);
		N n3 = new N(10,20);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		System.out.println(n3.hashCode());
		
		System.out.println(n1.equals(n2));
		System.out.println(n2.equals(n3));
		System.out.println(n1.equals(n3));
	}

}
