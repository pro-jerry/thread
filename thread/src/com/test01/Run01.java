package com.test01;

public class Run01 {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA0 a = new ThreadA0(service);
		a.setName("A");
		a.start();
		ThreadB0 b = new ThreadB0(service);
		b.setName("B");
		b.start();
		Thread.sleep(3000);
		service.signalAll_A();
	}
}
