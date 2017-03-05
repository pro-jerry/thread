package com.test05;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();
		Thread.sleep(5000);
		a.interrupt();
	}
}
