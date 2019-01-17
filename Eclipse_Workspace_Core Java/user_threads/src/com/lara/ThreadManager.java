package com.lara;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadManager {

	public static void main(String[] args) {

		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		FirstClass first = new FirstClass(s1, s2);
		SecondClass second = new SecondClass(s1, s2);
		
		Thread t1 = new Thread(first);
		Thread t2 = new Thread(second);
		
		t1.start();
		t2.start();
		
		Util.sleep(3000);
		
		ThreadMXBean tx = ManagementFactory.getThreadMXBean();
		long[] threadArray = tx.findDeadlockedThreads();
		if(threadArray != null){
			System.out.println("Deadlocked Threads are: ");
			ThreadInfo ti[]	= tx.getThreadInfo(threadArray);
			for (ThreadInfo threadInfo : ti) {
				System.out.println("Thread Name: "+threadInfo.getThreadName());
			}
		}else{
			System.out.println("No deadlocked threads");
		}
		
		Util.sleep(2000);
		s1.notify();
		s2.notify();
	}

}
