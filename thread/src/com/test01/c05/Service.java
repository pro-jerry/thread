package com.test01.c05;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;

	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod(){
		try {
			lock.lock();
			System.out.println("公平锁的情况:"+lock.isFair());
		}finally{
			lock.unlock();
		}
	}
}
