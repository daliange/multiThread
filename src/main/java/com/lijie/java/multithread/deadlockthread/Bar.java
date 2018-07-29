package com.lijie.java.multithread.deadlockthread;

public class Bar {
	
	/**关键字synchronized很重要**/
	public static synchronized void incrementBar() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"incrementBar开始");
		Thread.currentThread().sleep(1000);
		System.out.println(Thread.currentThread().getName()+"incrementBar结束");
	}

}
