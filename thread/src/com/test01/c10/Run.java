package com.test01.c10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run {

	public volatile static int nextPrintWho = 1;
	private static ReentrantLock lock = new ReentrantLock();
	private final static Condition conditionA = lock.newCondition();
	private final static Condition conditionB = lock.newCondition();
	private final static Condition conditionC = lock.newCondition();
	public static void main(String[] args) {
		Thread  threadA = new Thread(){
			@Override
			public void run() {
				try {
					lock.lock();
					while(nextPrintWho!=-1){
						conditionA.await();
					}
					for(int i=0;i<3;i++){
						System.out.println("ThreadA"+(i+1));
					}
					nextPrintWho=2;
					conditionB.signalAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
			}
		};
	}
}
