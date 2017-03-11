package com.test02.c01;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
