package array_basics.app2;

import java.util.Arrays;

class A{
	int i;
	
	public A(int i){
		this.i = i;
	}

}

public class Manager1 {
	public static void main(String[] args) {
		
		A[] a1 = new A[2];
		a1[0] = new A(10);
		a1[1] = new A(20);
		
		System.out.println(a1);
		//System.out.println(Arrays.toString(a1));
		
	}
}
