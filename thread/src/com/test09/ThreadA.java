package com.test09;

public class ThreadA extends Thread{

	private MyService service;

	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		service.await();
	}
}
