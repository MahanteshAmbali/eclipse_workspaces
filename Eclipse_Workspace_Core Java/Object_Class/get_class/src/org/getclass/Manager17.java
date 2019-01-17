package org.getclass;

import java.lang.reflect.Method;
import java.util.Scanner;

class T{
	void test1(){
		System.out.println("From T-test1");
	}
}

class U{
	void test2(){
		System.out.println("From U-test2");
	}
}

public class Manager17 {

	public static void main(String[] args) throws Exception {

		String decider;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter class name");
			String className = sc.next();
			
			System.out.println("Enter method name");
			String methodName = sc.next();
			
			Class c1 = Class.forName(className);
			Method m1 = c1.getDeclaredMethod(methodName);
			
			Object o1 = c1.newInstance();
			m1.invoke(o1);
			System.out.println("Done");
			System.out.println("Find one more . ?");
			decider = sc.next();
		} while (decider.equalsIgnoreCase("y"));
	}

}
