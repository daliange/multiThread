package com.lijie.java.multithread.mythread;

public class Test {
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		/**给MyThread设置名称**/
		myThread.setName("my name is MyThread ! ");
		myThread.start();
		Thread.currentThread().setName("my name is main ! ");
		System.out.println("主线程名称："+Thread.currentThread().getName());
		System.out.println("主线程：运行结束！");
		
	}

}
