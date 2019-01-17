package org.hashcode;

class C{
	int i;
	
	public C(int i){
		this.i = i;
	}
/*	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}*/
}

public class Manager3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1 = new C(100);
		C c2 = new C(100);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
