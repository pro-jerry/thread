package com.test01.c06;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;

	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}
	
	public void methodService(){
		try{
			System.out.println(lock.isHeldByCurrentThread());
			lock.lock();
			
			System.out.println(lock.isHeldByCurrentThread());
		}finally{
			lock.unlock();
		}
	}
	
}
