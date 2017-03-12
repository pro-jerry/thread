package com.test02.c06;

public class MyThread2 extends Thread{

	@Override
	public void run() {
		super.run();
		MyService.serviceMethod();
	}
}
