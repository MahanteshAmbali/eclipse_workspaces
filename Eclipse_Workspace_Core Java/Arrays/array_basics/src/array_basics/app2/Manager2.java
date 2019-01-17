package array_basics.app2;

import java.util.Arrays;

class B{
	int i;
	B(int i){
		this.i = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
}
public class Manager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B[] b1 = new B[8];
		
		Arrays.fill(b1, new B(100));
		
		System.out.println(Arrays.toString(b1));
	}

}
