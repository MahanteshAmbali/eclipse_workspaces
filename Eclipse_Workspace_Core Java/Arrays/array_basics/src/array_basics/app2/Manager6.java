package array_basics.app2;

import java.util.Arrays;

class E implements Comparable{

	int i, j;
	
	public E(int i1, int j1){
		this.i = i1;
		this.j = j1;
	}
	
	@Override
	public int compareTo(Object arg0) {

		E e1 = (E)arg0;
		
		return j-e1.j;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i+", j: "+j+"||";
	}
}

public class Manager6 {

	public static void main(String[] args) {
		E[] e1 = {new E(1,4), new E(9,2), new E(3,9), new E(1,4)};
		System.out.println(Arrays.toString(e1));
		Arrays.sort(e1);
		System.out.println(Arrays.toString(e1));
	}

}
