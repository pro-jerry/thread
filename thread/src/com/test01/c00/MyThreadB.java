package com.test01.c00;

public class MyThreadB extends Thread{

	private MyService service;

	public MyThreadB(MyService service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<Integer.MAX_VALUE;i++){
			service.get();
		}
	}
}
