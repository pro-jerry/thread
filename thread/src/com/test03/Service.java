package com.test03;

public class Service {

	public void testMethod(Object lock){
		
		try {
			synchronized (lock) {
				System.out.println("begin wait");
				Thread.sleep(3000);
				System.out.println("end wait");
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
