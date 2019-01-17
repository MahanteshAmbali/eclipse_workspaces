package array_basics.app1;

public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[2];
		x[0] = 10;
		
		test(x);
		System.out.println(x[0]);
		
		test1(x[0]);
	}

	private static void test1(int i) {
		// TODO Auto-generated method stub
		System.out.println("From test1 method call was test1(x)");
	}

	private static void test(int[] x) {
		// TODO Auto-generated method stub
		System.out.println("From test method call was test(x)");
	}

}
