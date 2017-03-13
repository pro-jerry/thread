package com.test02.c11;

public class MyThread extends Thread{

	@Override
	public void run() {
		String username=null;
		System.out.println(username.hashCode());
	}
}
