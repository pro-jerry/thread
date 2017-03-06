package com.test01.c01;

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
		for(int i=0;i<Integer.MAX_VALUE;i++){
			service.set();
		}
	}
}
