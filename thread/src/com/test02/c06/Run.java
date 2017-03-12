package com.test02.c06;

public class Run {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.setName("a1");
		t1.start();
		MyThread2 t2 = new MyThread2();
		t2.setName("a2");
		t2.start();
		System.out.println("main方法中的t2状态:"+t1.getState());
	}
}
