package org.getclass;

import java.lang.reflect.Method;

class S{
	
	int test(String s1){
		
		System.out.println(s1);
		return 10;
	}
}

public class Manager16 {

	public static void main(String[] args) throws Exception {
		
		Class c1 = Class.forName("org.getclass.S");
		Object o1 = c1.newInstance();
		
		Method m1 = c1.getDeclaredMethod("test", String.class);
		int i = (int) m1.invoke(o1, "abc");
		System.out.println("Done");
	}

}
