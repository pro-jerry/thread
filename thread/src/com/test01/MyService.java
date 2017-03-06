package com.test01;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();
	
	public void awaitA(){
		try {
			lock.lock();
			System.out.println("begin waitA的时间为："+System.currentTimeMillis()
					+"ThreadName="+Thread.currentThread().getName());
			conditionA.await();
			System.out.println("end waitA的时间为："+System.currentTimeMillis()
					+"ThreadName="+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void awaitB(){
		try {
			lock.lock();
			System.out.println("begin waitB的时间为："+System.currentTimeMillis()
					+"ThreadName="+Thread.currentThread().getName());
			conditionB.await();
			System.out.println("end waitB的时间为："+System.currentTimeMillis()
					+"ThreadName="+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void signalAll_A(){
		
		try{
			lock.lock();
			System.out.println("bsignalAll_A的时间为："+System.currentTimeMillis()
					+"ThreadName="+Thread.currentThread().getName());
			conditionA.signalAll();
		}finally{
			lock.unlock();
		}
	}
	
	public void signalAll_B(){
		
		try{
			lock.lock();
			System.out.println("bsignalAll_B的时间为："+System.currentTimeMillis()
					+"ThreadName="+Thread.currentThread().getName());
			conditionB.signalAll();
		}finally{
			lock.unlock();
		}
	}
}
