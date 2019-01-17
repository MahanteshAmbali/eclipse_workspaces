package com.lara;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class Util_Sleep extends Thread{
	
	public static void putSleep(long milSec){
		try {
			sleep(milSec);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class Source{
	synchronized void test1(Source s){
		System.out.println("Test1 Begin");
		Util_Sleep.putSleep(1000);
		s.test2(this);
		System.out.println("Test1 End");
	}
	
	synchronized void test2(Source s){
		System.out.println("Test2 Begin");
		Util_Sleep.putSleep(1000);
		s.test1(this);
		System.out.println("Test2 End");
	}
}

class Thread11 extends Thread{
	Source s1, s2;
	public Thread11(Source s1, Source s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		s1.test1(s2);
	}
}

class Thread12 extends Thread{
	Source s1, s2;
	public Thread12(Source s1 , Source s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		s2.test1(s1);
	}
}

public class Manager5_Thread_Deadlock_Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source s1 = new Source();
		Source s2 = new Source();
		
		Thread11 t1 = new Thread11(s1, s2);
		Thread12 t2 = new Thread12(s1, s2);
		
		t1.start();
		t2.start();
		
		Util_Sleep.putSleep(2000);
		
		ThreadMXBean txBean = ManagementFactory.getThreadMXBean();
		
		long ids[] = txBean.findDeadlockedThreads();
		ThreadInfo thInfo = null;
		
		if (ids != null) {
			System.out.println("Threads Under Deadlock are: ");
			ThreadInfo ti[] = txBean.getThreadInfo(ids);
			for (int i = 0; i < ti.length; i++) {
				thInfo = ti[i];
				System.out.println(thInfo.getThreadName());
			}
		} else {
			System.out.println("No threads under Deadlock");
		}
	}
}
