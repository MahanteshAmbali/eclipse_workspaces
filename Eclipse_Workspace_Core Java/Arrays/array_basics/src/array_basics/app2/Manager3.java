package array_basics.app2;

import java.util.Arrays;

class C{
	int i;
	C(int i){
		this.i = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
}

public class Manager3 {

	public static void main(String[] args) {

		C[] c1 = new C[5];
		Arrays.fill(c1, 0, 3, new C(100));
		Arrays.fill(c1, 3, c1.length, new C(200));
		
		System.out.println(Arrays.toString(c1));
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
	}

}
