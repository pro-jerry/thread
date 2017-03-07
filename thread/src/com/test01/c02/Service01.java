package com.test01.c02;

import java.util.concurrent.locks.ReentrantLock;

public class Service01 {

	private ReentrantLock lock = new ReentrantLock();
	public void serviceMethod01(){
		
		try {
			lock.lock();
			System.out.println("serviceMethod01 getHoldCount="+lock.getHoldCount());
			serviceMethod02();
		}finally{
			lock.unlock();
		}
	}
	private void serviceMethod02() {
		try {
			lock.lock();
			System.out.println("serviceMethod02 getHoldCount="+lock.getHoldCount());
			serviceMethod02();
		}finally{
			lock.unlock();
		}
		
	}
}
