package com.lara;

class F{
	int i;
	
	@Override
	public boolean equals(Object obj) {

		boolean flag = false;
		
		if(!(obj instanceof F)){
			return flag;
		}
		
		flag = (this.i == ((F)obj).i);
		return flag;
	}
}

class G{
	int j;
	
	@Override
	public boolean equals(Object obj) {

		boolean flag = false;
		
		if(!(obj instanceof G)){
			return flag;
		}
		
		flag = (this.j == ((G)obj).j);
		return flag;
	}
}

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f1 = new F();
		G g1 = new G();
		F f2 = new F();
		G g2 = new G();
		
		System.out.println(f1.equals(f2));
		System.out.println(g1.equals(g2));
		
		System.out.println(f1.equals(g1));
		System.out.println(g1.equals(f1));
	}

}
