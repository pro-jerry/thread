package com.test02.c01;

public class Run {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();
		t2.start();
		MyThread t3 = new MyThread();
		t3.start();
	}
}
