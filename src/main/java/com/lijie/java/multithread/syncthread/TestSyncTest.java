package com.lijie.java.multithread.syncthread;

public class TestSyncTest {
	
	public static void main(String[] args) {
		SyncThread syncThread = new SyncThread();
		Thread a = new Thread(syncThread);
		a.setName("Thread a :");
		Thread b = new Thread(syncThread);
		b.setName("Thread b :");
		a.start();
		b.start();
	}

}
