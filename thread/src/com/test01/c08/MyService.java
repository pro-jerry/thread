package com.test01.c08;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	public ReentrantLock lock = new ReentrantLock();
	public void waitMethod(){
		if(lock.tryLock()){
			System.out.println(Thread.currentThread().getName()+"获得该锁");
		}else{
			System.out.println(Thread.currentThread().getName()+"没有获得该锁");
		}
	}
}
