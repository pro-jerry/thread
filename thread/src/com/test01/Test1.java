package com.test01;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			String str = new String("");
			str.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
