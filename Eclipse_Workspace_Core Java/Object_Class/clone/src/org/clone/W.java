package org.clone;

class B{
	
	int i;
}

class C{
	
	int j;
}

public class W implements Cloneable{

	int k;
	B obj1;
	C obj2;
	
	@Override
	protected Object clone(){
		W w1 = null;
		
		try {
			w1 = (W)super.clone();	
		} catch (CloneNotSupportedException  e) {
		
			e.printStackTrace();
		}

		w1.obj1 = new B();
		w1.obj1.i = this.obj1.i;
		
		w1.obj2 = new C();
		w1.obj2.j = this.obj2.j;
		
		return w1;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
	
		W w1 = new W();
		w1.k = 10;
		
		w1.obj1 = new B();
		w1.obj1.i = 20;
		
		w1.obj2 = new C();
		w1.obj2.j = 30;
		
		W w2 = (W)w1.clone();
		System.out.println(w2.k);
		System.out.println(w2.obj1.i);
		System.out.println(w2.obj2.j);
		
		
	}
}
