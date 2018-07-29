package com.lijie.java.multithread.myrunnable;

public class MyRunnable implements Runnable {

	/**实现Runnable接口**/
	public void run() {
		System.out.println("MyRunnable="+Thread.currentThread().getName());
	}

}
