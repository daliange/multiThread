package com.lijie.java.thread01.threadstart;

public class MyThread extends Thread {

	private int i;

	public MyThread(int i) {
		super();
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(i);
	}

}
