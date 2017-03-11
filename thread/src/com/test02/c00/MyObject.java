package com.test02.c00;

public class MyObject {

	private static MyObject object = new MyObject();

	public MyObject() {
		super();
	}
	
	public static MyObject getInstance(){
		return object;
	}
}
