package com.test02.c12;

import java.lang.Thread.UncaughtExceptionHandler;

public class ObjectUncaughtExceptionHandler implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {

		System.out.println("对象的异常处理");
		e.printStackTrace();
	}

	
}
