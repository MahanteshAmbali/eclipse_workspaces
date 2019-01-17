package array_basics.app1;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		test1(i);
		test1(20);
		
		int[] x = new int[3];
		x[0] = 0;
		x[1] = 1;
		x[2] = 2;
		
		test2(x);
		test2(new int[]{0,10,20});
	}

	private static void test2(int[] x) {
		// TODO Auto-generated method stub
		System.out.println(x.length);
	}

	private static void test1(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}

}
