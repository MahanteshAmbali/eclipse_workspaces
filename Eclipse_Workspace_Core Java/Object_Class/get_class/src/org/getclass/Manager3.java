package org.getclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class C{
	
	public int i;
	void test1(){
		
	}
}

class D extends C{
	
	public int j;
	public D() {
	
	}
	void test2(){
		
	}
}

public class Manager3 {

	public static void main(String[] args) {
		
		D d1 = new D();
		Class C1 = d1.getClass();
		Field[] F1 = C1.getFields();
		for (Field field : F1) {
			System.out.println(field.getName());
			System.out.println(field.getType());
		}
		
		System.out.println("-----------------");
		
		Field[] F2 = C1.getDeclaredFields();
		for (Field field : F2) {
			System.out.println(field.getName());
			System.out.println(field.getType());
		}
		
		System.out.println("-----------------");
		
		Method[] M1 = C1.getMethods();
		for (Method method : M1) {
			System.out.println(method.getName());
			System.out.println(method.getReturnType());
		}
		
		System.out.println("-----------------");
		
		Method[] M2 = C1.getDeclaredMethods();
		for (Method method : M2) {
			System.out.println(method.getName());
			System.out.println(method.getReturnType());
		}
		
		System.out.println("-----------------");
		
		Constructor[] constr = C1.getDeclaredConstructors();
		for (Constructor constructor : constr) {
			System.out.println(constructor.getName());
		}
		
		System.out.println("-----------------");
	}
}
