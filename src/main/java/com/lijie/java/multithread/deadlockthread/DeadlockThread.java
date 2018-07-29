package com.lijie.java.multithread.deadlockthread;

public class DeadlockThread implements Runnable{
	
	public void run() {

		try {
			Bar.incrementBar();
			Foo.incrementFoo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
