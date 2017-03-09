package com.test01.c09;

public class Run {

	public static void main(String[] args) {
		final MyService service = new MyService();
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+"调用waitMethod的时间"+System.currentTimeMillis());
				service.waitMethod();
			}
		};
		Thread threadA = new Thread(runnable);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnable);
		threadB.setName("B");
		threadB.start();
		
	}
}
