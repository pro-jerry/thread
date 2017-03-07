package com.test01.c02;

public class Run02 {

	public static void main(String[] args) throws InterruptedException {
		final Service02 service = new Service02();
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				service.serviceMethod1();
			}
		};
		Thread[] threadArray = new Thread[10];
		for(int i=0;i<10;i++){
			threadArray[i] = new Thread(runnable);
		}
		for(int i=0;i<10;i++){
			threadArray[i].start();
		}
		Thread.sleep(2000);
		System.out.println("有线程数："+service.lock.getQueueLength()+"个在等待获取锁");
	}
}
