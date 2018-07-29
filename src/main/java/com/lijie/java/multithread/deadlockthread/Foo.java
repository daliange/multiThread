package com.lijie.java.multithread.deadlockthread;

public class Foo {
	
	/**关键字synchronized很重要**/
	public static synchronized void incrementFoo() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"incrementFoo开始");
		Thread.currentThread().sleep(1000);
		System.out.println(Thread.currentThread().getName()+"incrementFoo结束");
	}

}
