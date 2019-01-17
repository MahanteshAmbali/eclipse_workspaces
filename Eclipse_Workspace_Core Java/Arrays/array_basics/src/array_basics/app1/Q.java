package array_basics.app1;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new int[]{10,20});
	}

	private static void test(int[] is) {
		// TODO Auto-generated method stub
		System.out.println(is.length);
		for (int i : is) {
			System.out.println(i);
		}
	}

}
