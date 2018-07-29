package com.lijie.java.multithread.mythread.variables;

public class ThreadVariables extends Thread{
	
	int i = 5 ;
	
	@Override
	public void run() {
		for(int a =5 ;a >=0 ;a--){
			System.out.println(Thread.currentThread().getName()+":i="+i);
			i--;
		}
		
		
	}
}
