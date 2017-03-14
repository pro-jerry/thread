package com.test02.c12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SimpleThreadLocal {

	private Map valueMap=Collections.synchronizedMap(new HashMap());
	public void set(Object newValue){
		valueMap.put(Thread.currentThread(), newValue);
	}
	
	public Object get(){
		Object o = valueMap.get(Thread.currentThread());
		if(o==null &&!valueMap.containsKey(Thread.currentThread())){
			o=initialValue();
		}
		return o;
	}
	
	public Object initialValue(){
		return null;
	}
	
	public void remove(){
		valueMap.remove(Thread.currentThread());
	}
}
