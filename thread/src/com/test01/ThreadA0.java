package com.test01;

import com.test02.Run;

public class ThreadA0 extends Thread{

	private MyService service;

	public ThreadA0(MyService service) {
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
