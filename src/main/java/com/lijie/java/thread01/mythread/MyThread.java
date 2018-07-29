package com.lijie.java.thread01.mythread;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
}
