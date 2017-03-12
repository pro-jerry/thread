package com.test02.c04;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		System.out.println("main方法中的状态1:"+t.getState());
		Thread.sleep(1000);
		t.start();
		Thread.sleep(10000);
		System.out.println("main方法中的状态2:"+t.getState());
	}
}
