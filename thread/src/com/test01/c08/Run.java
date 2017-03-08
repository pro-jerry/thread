package com.test01.c08;

public class Run {

	public static void main(String[] args) {
		final MyService service = new MyService();
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				service.waitMethod();
			}
		};
		Thread threadA =new Thread(runnable);
		threadA.setName("A");
		threadA.start();
		Thread threadB =new Thread(runnable);
		threadB.setName("B");
		threadB.start();
	}
	
}
