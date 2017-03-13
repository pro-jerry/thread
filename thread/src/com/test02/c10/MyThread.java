package com.test02.c10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread{

	private SimpleDateFormat sdf;
	private String dataString;
	public MyThread(SimpleDateFormat sdf, String dataString) {
		super();
		this.sdf = sdf;
		this.dataString = dataString;
	}
	
	@Override
	public void run() {
		
		Date dateRef;
		try {
			dateRef = DateTools.getSimpleDateFormat("yyyy-MM-dd").parse(dataString);
			String newDateString = DateTools.getSimpleDateFormat("yyyy-MM-dd").format(dateRef).toString();
			if(!newDateString.equals(dataString)){
				System.out.println("ThreadName="+this.getName()
						+"报错了日期字符串"+dataString+"转换成的日期为:"+newDateString);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
