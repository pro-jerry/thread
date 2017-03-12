package com.test02.c02;

public class MyObject {

	private static class MyObjectHandler{
		private static MyObject myObject = new MyObject();
	}
	
	public MyObject(){
		
	}
	public static MyObject getInstance(){
		return MyObjectHandler.myObject;
	}
	
	protected Object readResolve(){
		System.out.println("调用了readResolve方法");
		return MyObjectHandler.myObject;
	}
}
