package com.lijie.java.thread01.mythread;



public class Run {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		System.out.println("运行结束！");
	}

}
