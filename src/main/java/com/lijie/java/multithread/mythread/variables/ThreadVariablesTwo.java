package com.lijie.java.multithread.mythread.variables;

public class ThreadVariablesTwo extends Thread{
	
	int i  ;
	
	public ThreadVariablesTwo(int i) {
		this.i = i;
	}
	
	@Override
	synchronized public void run() {
		
		System.out.println(Thread.currentThread().getName()+"执行前:i="+i);
		i--;
		System.out.println(Thread.currentThread().getName()+"执行后:i="+i);
	
			
	}
}
