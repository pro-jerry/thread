package com.test01.c06;

public class Run {

	public static void main(String[] args) {
		final Service service = new Service(true);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				service.methodService();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
