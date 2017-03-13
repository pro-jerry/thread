package com.test02.c12;

import java.lang.Thread.UncaughtExceptionHandler;

public class StateUncaughtExceptionHandler implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {

		System.out.println("静态的异常处理");
		e.printStackTrace();
	}

	
}
