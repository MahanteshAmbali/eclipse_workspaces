package array_basics.app1;

public class N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[2];
		x[0] = 10;
		Object y = x;
		//y[1] = 20;
		
		int[] z = (int[])y;
		z[1] = 30;
		System.out.println("done");
	}

}
