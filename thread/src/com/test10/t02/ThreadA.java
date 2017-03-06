package com.test10.t02;

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
		service.awaitA();
	}
}
