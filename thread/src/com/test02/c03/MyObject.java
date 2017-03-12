package com.test02.c03;

import java.io.Serializable;

public class MyObject implements Serializable{

	private  final static long serialVersionUID=888L;
	private static class MyObjectHandler{
		private static final MyObject myObject = new MyObject();
	}
	
	private MyObject(){
		
	}
	
	public static MyObject getInstance(){
		return MyObjectHandler.myObject;
	}
}
