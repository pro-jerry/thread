package com.test02.c12;

public class Run1 {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
	}
}
