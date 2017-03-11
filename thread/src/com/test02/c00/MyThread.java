package com.test02.c00;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
