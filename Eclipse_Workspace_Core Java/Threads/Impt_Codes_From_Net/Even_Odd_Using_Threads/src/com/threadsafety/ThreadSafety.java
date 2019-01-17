package com.threadsafety;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadSafety {
	 
    public static void main(String[] args) throws InterruptedException {
     
        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        //wait for threads to finish processing
        t1.join();
        t2.join();
        System.out.println("Processing count="+pt.getCount());
        
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
 
class ProcessingThread implements Runnable{
    private int count;
     
    @Override
    public void run() {
        for(int i=1; i< 5; i++){
            processSomething(i);
            count++;
        }
    }
 
    public int getCount() {
        return this.count;
    }
 
    private void processSomething(int i) {
        // processing some <span style="font-weight: bold; height: 12px;" id="vnjdj53_2" class="vnjdj53">job</span>
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
}