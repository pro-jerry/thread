package com.test02.c07;

public class MyThread extends Thread{

	@Override
	public void run() {
		synchronized (Lock.lock) {
			try {
				Lock.lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
