package com.test01.c13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1 {

	private static Timer timer = new Timer();
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("运行了!时间为:"+new Date());
		}
		
	}
	public static void main(String[] args) throws ParseException {
		MyTask task = new MyTask();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dataString = "2017-03-09 12:20:15";
		Date dateRef = sdf.parse(dataString);
		System.out.println("字符串时间:"+dateRef.toLocaleString()+"当前时间:"+new Date().toLocaleString());
		timer.schedule(task, dateRef);
	}
}
