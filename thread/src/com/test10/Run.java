package com.test10;

public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		MyThreadA a = new MyThreadA(service);
		a.start();
	}
}
