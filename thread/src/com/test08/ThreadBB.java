package com.test08;

public class ThreadBB extends Thread{

	private MyService service;

	public ThreadBB(MyService service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.methodB();
	}
}
