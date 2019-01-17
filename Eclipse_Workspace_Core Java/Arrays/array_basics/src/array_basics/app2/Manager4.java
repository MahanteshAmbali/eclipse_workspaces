package array_basics.app2;

import java.util.Arrays;

class D implements Comparable<Object> {

	int i;
	D(int i){
		this.i = i;
	}
	
	@Override
	public int compareTo(Object arg0) {
		
		D d1 = (D)arg0;
				
		return i - d1.i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
	
}

public class Manager4 {

	public static void main(String[] args) {
		
		D[] d1 = {new D(10), new D(90), new D(2) , new D(39) };
		
		System.out.println(Arrays.toString(d1));
		Arrays.sort(d1);
		System.out.println(Arrays.toString(d1));
	}
}
