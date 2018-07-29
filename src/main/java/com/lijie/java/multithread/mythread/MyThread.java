package com.lijie.java.multithread.mythread;

public class MyThread extends Thread {
	
	/**继承Threa类，需要重写run方法**/
	@Override
	public void run() {
		//super.run();???
		//super.run();
		System.out.println("新线程：开始运行");
		System.out.println("新线程名称："+Thread.currentThread().getName());
		
	}

}
