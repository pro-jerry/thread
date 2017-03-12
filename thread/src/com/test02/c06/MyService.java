package com.test02.c06;

public class MyService {

	public static synchronized void serviceMethod(){
		
		try {
			System.out.println(Thread.currentThread().getName()+"进入了业务方法!");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
