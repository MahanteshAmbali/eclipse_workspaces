package org.getclass;

class O{
	
	private int i;
	
	public O(int i) {
		this.i = i;
	}
}

public class Manager12 {

	public static void main(String[] args) throws Exception{

		Class c1 = Class.forName("org.getclass.O");
		O o1 = (O)c1.newInstance();
		System.out.println("Done");
	}

}
