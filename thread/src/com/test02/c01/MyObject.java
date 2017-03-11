package com.test02.c01;

public class MyObject {

	private static MyObject myObject;
	public MyObject() {
	}
	public synchronized static MyObject getInstance(){
		//延迟加载
		if(null==myObject){
			myObject = new MyObject();
		}
		return myObject;
	}
}
