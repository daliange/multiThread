package com.lijie.java.multithread.mythread.variables;

public class Test {
	
	public static void main(String[] args) {
		
		ThreadVariables t1 = new ThreadVariables();
		ThreadVariables t2 = new ThreadVariables();
		ThreadVariables t3 = new ThreadVariables();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
