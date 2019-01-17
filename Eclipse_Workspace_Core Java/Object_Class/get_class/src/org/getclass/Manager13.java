package org.getclass;

import java.lang.reflect.Method;

class P{
	void test(){
		System.out.println("From Test()");
	}
}

public class Manager13 {

	public static void main(String[] args) throws Exception{

		Class c1 = Class.forName("org.getclass.P");
		P p1 =(P)c1.newInstance();
		p1.test();
		
		Object obj1 = c1.newInstance();
		P p2 = (P)obj1;
		p2.test();
		
		Object obj2 = c1.newInstance();
		Method method = c1.getDeclaredMethod("test");
		method.invoke(obj2);		
	}

}
