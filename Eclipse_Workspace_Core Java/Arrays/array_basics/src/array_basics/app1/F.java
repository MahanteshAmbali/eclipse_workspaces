package array_basics.app1;

public class F {

	public static void main(String[] args) {

		int[] x = new int[4];
		
		System.out.println(x.length);

		for (int i = 0; i < x.length; i++) {
			x[i] = i;
		}

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
