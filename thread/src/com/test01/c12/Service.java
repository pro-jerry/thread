package com.test01.c12;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public void read(){
		try {
			
			try{
				lock.readLock().lock();
				System.out.println("获得读锁:"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				Thread.sleep(10000);
			}finally{
				lock.readLock().unlock();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void write(){
		try {
			
			try{
				lock.writeLock().lock();
				System.out.println("获得写锁:"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				Thread.sleep(10000);
			}finally{
				lock.writeLock().unlock();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
