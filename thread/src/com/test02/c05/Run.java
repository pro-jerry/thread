package com.test02.c05;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(1000);
		System.out.println("main方法中的state："+t.getState());
	}
}
