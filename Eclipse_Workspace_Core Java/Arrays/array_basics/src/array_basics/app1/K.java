package array_basics.app1;

public class K {

	public static void main(String[] args) {

		int[] x = new int[2];
		x[0] = 10;
		test1(x);
		System.out.println(x[0]);
		
		test2(x[0]);
		System.out.println(x[0]);
	}

	private static void test2(int i) {
		// TODO Auto-generated method stub
		i = 2000;
	}

	private static void test1(int[] x) {
		// TODO Auto-generated method stub
		x[0] = 200;
	}

}
