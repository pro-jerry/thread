package com.test10.t02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void awaitA(){
		
		try{
		lock.lock();
		System.out.println("begin waitA的时间为："+System.currentTimeMillis()+"ThreadName="+Thread.currentThread().getName());
		condition.await();
		System.out.println("end waitA的时间为："+System.currentTimeMillis()+"ThreadName="+Thread.currentThread().getName());
		
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void awaitB(){
		
		try{
		lock.lock();
		System.out.println("begin waitB的时间为："+System.currentTimeMillis()+"ThreadName="+Thread.currentThread().getName());
		condition.await();
		System.out.println("end waitB的时间为："+System.currentTimeMillis()+"ThreadName="+Thread.currentThread().getName());
		
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void signalAll(){
		try{
			lock.lock();
			System.out.println("signalAll 的时间为："+System.currentTimeMillis()+"ThreadName="+Thread.currentThread().getName());
			condition.signalAll();
		}finally{
			lock.unlock();
		}
	}
}
