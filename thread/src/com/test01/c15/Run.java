package com.test01.c15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {

	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("运行了,时间为:"+new Date());
		}
	}
	public static void main(String[] args) throws ParseException {
		MyTask task = new MyTask();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = "2017-03-11 23:00:00";
		Timer timer = new Timer();
		Date dateRef = sdf.parse(dateString);
		System.out.println("z字符串时间为:"+dateRef.toLocaleString()+"当前时间:"+new Date().toLocaleString());
		timer.schedule(task, dateRef, 4000);
		
		
	}
}
