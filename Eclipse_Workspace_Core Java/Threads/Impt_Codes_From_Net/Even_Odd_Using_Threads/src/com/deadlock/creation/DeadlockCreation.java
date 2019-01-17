package com.deadlock.creation;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

import javax.management.MXBean;

class Util_Sleep extends Thread{
	
	public static void putToSleep(long num){
		try {
			sleep(num);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class Source{
	
	public synchronized void test1(Source s){
		System.out.println("In test1 Begin");
		Util_Sleep.putToSleep(1000);
		s.test2(this);
		System.out.println("In test1 End");
	}
	
	public synchronized void test2(Source s){
		System.out.println("In test2 Begin");
		Util_Sleep.putToSleep(1000);
		s.test1(this);
		System.out.println("In test2 End");
	}
}


class Thread1 extends Thread{
	Source s1, s2;
	public Thread1(Source s1, Source s2) {
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


class Thread2 extends Thread{
	Source s1, s2;
	public Thread2(Source s1, Source s2) {
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

public class DeadlockCreation {

	public static void main(String[] args) {
	
		Source s1 = new Source();
		Source s2 = new Source();
		
		Thread1 t1 = new Thread1(s1, s2);
		Thread2 t2 = new Thread2(s1, s2);
		
		t1.start();
		t2.start();
		
		Util_Sleep.putToSleep(2000);
		
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
			System.out.println("No threads under deadlock");
		}
	}
}