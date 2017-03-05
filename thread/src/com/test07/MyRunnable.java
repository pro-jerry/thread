package com.test07;

public class MyRunnable {

	private static Object lock = new Object();
	private static Runnable runnable1 = new Runnable() {
		@Override
		public void run() {
			
			try {
				synchronized (lock) {
					System.out.println("wait begin time="+System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("end begin time="+System.currentTimeMillis());
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	
	public static void main(String[] args) {
		Thread t = new Thread(runnable1);
		t.start();
	}
}
