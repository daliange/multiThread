package com.lijie.java.thread01.myrunnable;


public class Run {

	public static void main(String[] args) {
		Runnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
		thread.start();
		System.out.println("main方法结束!");
	}

}
