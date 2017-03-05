package com.test10;

public class MyThreadA extends Thread{

	private MyService service;

	public MyThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		service.waitMethod();
	}
}
