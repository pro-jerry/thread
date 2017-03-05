package com.test01;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList();
	public void add(){
		list.add("何军");
	}
	
	public int size(){
		return list.size();
	}
}
