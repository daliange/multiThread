package com.lijie.java.multithread.mythread;

public class TestThree {
	
	public static void main(String[] args) {
		
		MyThreadThree myThreadThree1 = new MyThreadThree(1);
		MyThreadThree myThreadThree2 = new MyThreadThree(2);
		MyThreadThree myThreadThree3 = new MyThreadThree(3);
		MyThreadThree myThreadThree4 = new MyThreadThree(4);
		MyThreadThree myThreadThree5 = new MyThreadThree(5);
		
		myThreadThree1.start();
		myThreadThree2.start();
		myThreadThree3.start();
		myThreadThree4.start();
		myThreadThree5.start();
	}

}
