package com.first;

class G extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Begin");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("End");
	}
}

public class Manager7_Thread_State_Termin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		G g1 = new G();
		Thread t1 = new Thread(g1);
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		t1.stop();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(t1.getState());
	}
}
