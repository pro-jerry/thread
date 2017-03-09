package com.test01.c12;

public class ThreadA extends Thread{

	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		service.write();;
	}
}
