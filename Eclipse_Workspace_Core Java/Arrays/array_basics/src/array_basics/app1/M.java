package array_basics.app1;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[3];
		int[] y = x;
		
		Object obj = y;
		int[] z = (int[])obj;
		
		System.out.println("Done");
	}

}
