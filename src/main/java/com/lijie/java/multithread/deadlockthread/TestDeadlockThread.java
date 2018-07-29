package com.lijie.java.multithread.deadlockthread;

/**
 * 未能制造死锁现象,对象有多个同步化方法，但是只有一个锁，因此无法造成死锁现象
 * （两个线程，一个对象，无法造成死锁现象）
 * 
 * 制造成死锁现象，需要两个线程，两个对象
 * **/
public class TestDeadlockThread {
	
	public static void main(String[] args) {
		DeadlockThread deadlockThread = new DeadlockThread();
		Thread a = new Thread(deadlockThread);
		a.setName("Thread a :");
		Thread b = new Thread(deadlockThread);
		b.setName("Thread b :");
		a.start();
		b.start();
	}

}
