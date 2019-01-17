package com.lara;

class L{
	int i;
	public L(int i){
		this.i = i;
	}
}

class M{
	L l1;
	int j;
	public M(L l1 , int j){
		this.l1 = l1;
		this.j = j;
	}
	
	@Override
	public boolean equals(Object obj) {

		boolean flag = false;
		
		if(!(obj instanceof M)){
			return flag;
		}
		
		if(this.l1 != null && ((M)obj).l1 != null){
			flag = ((this.l1.i == ((M)obj).l1.i));
		}
		return flag;
	}
}

public class Manager6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L l1 = new L(10);
		M m1 = new M(l1, 10);
		M m2 = new M(l1, 10);
		System.out.println(m1.equals(m2));
	}

}
