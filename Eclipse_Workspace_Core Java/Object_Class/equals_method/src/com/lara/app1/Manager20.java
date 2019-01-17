package com.lara.app1;

class T{
	
	int i;
	
	public T(int i){
		this.i = i;
	}
	
	@Override
	public boolean equals(Object arg0) {
		
		T t1 = (T)arg0;
		return i == t1.i;
	}
}

public class Manager20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		T t1 = new T(90);
		T t2 = new T(90);
		
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
	}

}
