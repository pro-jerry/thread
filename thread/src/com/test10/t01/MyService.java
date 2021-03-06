package com.test10.t01;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void await(){
		
		try {
			lock.lock();
			System.out.println("await的时间为:"+System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void signal(){
		
		try {
			lock.lock();
			System.out.println("sinal的时间为："+System.currentTimeMillis());
			condition.signal();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
