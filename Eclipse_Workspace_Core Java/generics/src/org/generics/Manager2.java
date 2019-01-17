package org.generics;

class C<X>{
		
	X i;
	
	C(X i){
		this.i = i;
	}
}

class D1{

	@Override
	public String toString() {
		return "D1 [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
public class Manager2 {

	public static void main(String[] args) {

		C<Integer> c1 = new C<Integer>(34);
		System.out.println(c1.i);
		
		C<D1> c2 = new C<D1>(new D1());
		System.out.println(c2.i);
	}

}
