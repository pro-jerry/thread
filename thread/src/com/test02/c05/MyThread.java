package com.test02.c05;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("begin sleep");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end sleep");
	}
}
