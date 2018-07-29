package com.lijie.java.multithread.mythread;

public class MyThreadThree extends Thread{
	
	private int i;
	public MyThreadThree(int i) {
		//super();
		this.i = i;
	}
	
	@Override
	public void run() {
		//super.run();
		System.out.println(i);
	}
	
	

}
