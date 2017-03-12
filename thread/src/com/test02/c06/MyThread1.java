package com.test02.c06;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		super.run();
		MyService.serviceMethod();
	}
}
