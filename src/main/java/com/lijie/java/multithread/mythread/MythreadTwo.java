package com.lijie.java.multithread.mythread;

public class MythreadTwo extends Thread{
	
	@Override
	public void run() {
		//super.run();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("MythreadTwo="+Thread.currentThread().getName());
			
		}
		
	}

}
