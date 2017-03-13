package com.test02.c07;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(1000);
		System.out.println("main方法中的t的状态:"+t.getState());
	}
}
