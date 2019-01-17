package array_basics.app2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class F{
	int i, j;
	
	F(int i1, int j1){
		this.i = i1;
		this.j = j1;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i+" ,j: "+j;
	}
}

class G implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		F f1 =(F)arg0;
		F f2 = (F)arg1;
		
		return f1.i - f2.i;
	}
	
}

class H implements Comparator{
	
	@Override
	public int compare(Object arg0, Object arg1) {
		F f1 =(F)arg0;
		F f2 = (F)arg1;
		
		return f1.j - f2.j;
	}
	
}

public class Manager7 {

	public static void main(String[] args) {

		F[] f1 = {new F(1,9), new F(3,1), new F(9,1), new F(4,1)};
		System.out.println(Arrays.toString(f1));
		Arrays.sort(f1);
		System.out.println(Arrays.toString(f1));
		
		Arrays.sort(f1, new H());
		System.out.println(Arrays.toString(f1));
	}
}
