package array_basics.app1;

public class L {

	public static void main(String[] args) {

		int[] x = new int[3];
		int[] y = new int[50];
		y[49] = 100;
		x = y;
		y = x;
		
		System.out.println(x[49]);
	}

}
