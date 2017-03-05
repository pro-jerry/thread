package com.test01;

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		
		Object lock = new Object();
		MyThread1 t1 = new MyThread1(lock);
		t1.start();
		Thread.sleep(2000);
		MyThread2 t2 = new MyThread2(lock);
		t2.start();
	}
}
