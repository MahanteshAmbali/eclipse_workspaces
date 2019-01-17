package org.getclass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class B{
	
	int i;
	void test1(){
		
	}
}

public class Manager2 {

	public static void main(String[] args) {
		
		B b1 = new B();
		Class c1 = b1.getClass();
		Field[] x = c1.getDeclaredFields();
		for (Field field : x) {
			System.out.println(field.getName());
			System.out.println(field.getClass());
			System.out.println(field.getType());
		}
		
		System.out.println("------------------");
		
		Method[] methods = c1.getMethods();
		for (Method method : methods) {
			System.out.print(method.getReturnType());
			System.out.print(method.getName());
			System.out.print(" ();");
			System.out.println();
		}
	}
}
