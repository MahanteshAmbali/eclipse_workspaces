// USAGE OF INSTANCEOF OPERATOR;

package com.lara.app2;

class F{
	int i;
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		
		if(arg0 instanceof F){
			return ((F)arg0).i == this.i;
		}
		
		return false;
	}
}

class G{
	int j;
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		
		if(arg0 instanceof G){
			return ((G)arg0).j == this.j;
		}
		
		return false;
	}
}

public class Manager3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F f1 = new F();
		f1.i = 100;
		
		F f2 = new F();
		f2.i = 100;
		
		G g1 = new G();
		g1.j = 100;
		
		G g2 = new G();
		g2.j = 100;
		
		System.out.println(g1.equals(g2));
		System.out.println(f1.equals(f2));
		
		System.out.println("===========");
		
		System.out.println(g1.equals(f1));				// are supposed to produce 
		System.out.println(f1.equals(g1));				// ClassCastException
	}
}