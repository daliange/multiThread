package com.lijie.java.multithread.syncthread;

public class SyncThread implements Runnable{
	
	private int balance=0;
	
	public void run() {
		for(int i= 0 ;i<50; i++){
			System.out.println(Thread.currentThread().getName()+"更新前"+balance);
			try {
				incrementnew();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"更新后"+balance);
		}
	}
	
	/**关键字synchronized很重要**/
	public synchronized void incrementold() throws InterruptedException{
		int i = balance;
		Thread.currentThread().sleep(10);
		balance = i+1;
	}
	
	/**关键字synchronized的另外一种写法**/
	public void incrementnew() throws InterruptedException{
		synchronized(this){
			int i = balance;
			Thread.currentThread().sleep(10);
			balance = i+1;
		}
	}
}