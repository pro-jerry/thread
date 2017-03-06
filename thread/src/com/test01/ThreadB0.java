package com.test01;

public class ThreadB0 extends Thread{

	private MyService service;

	public ThreadB0(MyService service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		service.awaitB();
	}
}
