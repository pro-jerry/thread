package com.test04;

public class SynNotifyMothedThread extends Thread{

	private Object lock;

	public SynNotifyMothedThread(Object lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Service service = new Service();
		service.synNotifyMethod(lock);
	}
}
