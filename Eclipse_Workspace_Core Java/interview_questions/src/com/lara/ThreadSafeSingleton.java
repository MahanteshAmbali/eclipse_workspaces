package com.lara;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton obj1;
	
	private ThreadSafeSingleton() {
	
		System.out.println("ThreadSafeSingleton() ");
	}
	
	public static ThreadSafeSingleton getObject(){
	
		if(obj1 == null){
		
			synchronized (ThreadSafeSingleton.class){
				
				if(obj1 == null ) {
	
					obj1 = new ThreadSafeSingleton();
				}
			}
		}
		return obj1;
	}
}
