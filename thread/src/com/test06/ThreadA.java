package com.test06;

public class ThreadA extends Thread{

	private Object lock;

	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Service service = new Service();
		service.testMethod(lock);
	}
}
