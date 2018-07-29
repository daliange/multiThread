package com.lijie.java.multithread.mythread.variables;

public class TestTwo {
	
	public static void main(String[] args) {
		
		int i =5 ;
		
		ThreadVariablesTwo threadVariablesTwo = new ThreadVariablesTwo(i);
		
		Thread t1 = new Thread(threadVariablesTwo);
		Thread t2 = new Thread(threadVariablesTwo);
		Thread t3 = new Thread(threadVariablesTwo);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
