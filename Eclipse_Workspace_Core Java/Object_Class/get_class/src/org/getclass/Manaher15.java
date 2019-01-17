package org.getclass;

import java.lang.reflect.Method;

class R{
	
	void test1(){
		System.out.println("test1()");
	}
	
	void test1(int i){
		System.out.println("test2()");
	}
}

public class Manaher15 {

	public static void main(String[] args) throws Exception{
		Class c1 = Class.forName("org.getclass.R");
		Object o1 = c1.newInstance();
		
		Method m1 = c1.getDeclaredMethod("test1");
		m1.invoke(o1);
		
		Method m2 = c1.getDeclaredMethod("test1", int.class);
		m2.invoke(o1, 10);
	}

}
