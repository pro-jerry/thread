package com.test06;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(lock);
		b.setName("B");
		b.start();
		ThreadC c = new ThreadC(lock);
		c.setName("C");
		c.start();
		Thread.sleep(1000);
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();
	}
}
