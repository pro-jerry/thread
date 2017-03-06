package com.test01.c01;


public class Run {

	public static void main(String[] args) {
		MyService service =new MyService();
		MyThreadA[] threadA = new MyThreadA[10];
		MyThreadB[] threadB = new MyThreadB[10];
		for(int i=0;i<10;i++){
			threadA[i] = new MyThreadA(service);
			threadA[i].start();
			threadB[i] = new MyThreadB(service);
			threadB[i].start();
		}
	}
}
