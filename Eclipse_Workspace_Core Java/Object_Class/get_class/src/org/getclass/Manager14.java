package org.getclass;

import java.lang.reflect.Method;

class Q{
	
	void test(){
		System.out.println("From test()");
	}
}

public class Manager14 {

	public static void main(String[] args) throws Exception{
		
		Class c1 = Class.forName("org.getclass.Q");
		Object o1 = c1.newInstance();
		
		Method m1 = c1.getDeclaredMethod("test");
		m1.invoke(o1);
		System.out.println("Done");
	}
}
