package com.lara;

public class AakashBaba 
{
	public static int tot = 10;
	
	/*AakashBaba()
	{
		System.out.println("Test");
		System.out.println(this);
		int temp = this.tot;
		if(temp > 5)
		{
			System.out.println("pass");
		}
	}
	*/
	
	public static void main(String[] args) 
	{
		//new AakashBaba();
		method3();
	}

	private static void method1() 
	{
		// TODO Auto-generated method stub
		try {
			method2();
			System.out.println("Mahantesh baba ki jai ho");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Catch()");
		}finally{
			System.out.println("method1() finally");
		}
	}

	private static void method2() {
		// TODO Auto-generated method stub
		try{
			int a = 10/0;
		}finally{
			System.out.println("method2 finaly");
		}
		
	}
	
	public static void method3(){
		try {
				try {
					int i = 10/0;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					try {
						int i = 10/0;
					} catch (NullPointerException e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
				
				System.out.println("After 1st try");
				
				Class.forName("hello");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

class NewClass extends AakashBaba{
	public static void method3(){
		
	}
}