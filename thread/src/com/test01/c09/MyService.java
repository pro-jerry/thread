package com.test01.c09;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	public ReentrantLock lock = new ReentrantLock();
	public void waitMethod(){
		
		try {
			if(lock.tryLock(3, TimeUnit.SECONDS)){
				System.out.println(Thread.currentThread().currentThread()+"获得锁的时间:"+System.currentTimeMillis());
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			if(lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
}
