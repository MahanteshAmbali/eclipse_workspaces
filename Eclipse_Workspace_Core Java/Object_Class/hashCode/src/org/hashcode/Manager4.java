package org.hashcode;

class D{
	
	int i, j;
	
	public D(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i+j;
	}
}

public class Manager4 {

	public static void main(String[] args) {
		
		D d1 = new D(10,20);
		D d2 = new D(30,40);
		D d3 = new D(10,20);
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
	}

}
