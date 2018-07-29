package com.lijie.java.multithread.myrunnable;

import com.lijie.java.multithread.mythread.MythreadTwo;

public class Test {
	
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
//		MythreadTwo  mythreadTwo = new MythreadTwo();
//		Thread thread = new Thread(mythreadTwo);
		thread.start();
		System.out.println(thread.getName());
		System.out.println("main="+Thread.currentThread().getName());
	}

}
