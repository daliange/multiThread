package com.lijie.java.multithread.mythread;

public class TestTwo {
	
	public static void main(String[] args) {
		MythreadTwo mythreadTwo = new MythreadTwo();
		mythreadTwo.setName("MythreadTwo");
		//异步执行
		mythreadTwo.start();
		//同步执行
		//mythreadTwo.run();
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main="+Thread.currentThread().getName());
		}
		
	}

}
