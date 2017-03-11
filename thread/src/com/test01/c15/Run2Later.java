package com.test01.c15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2Later {

	private static Timer timer = new Timer();
	public static class MyTask1 extends TimerTask{
		@Override
		public void run() {
			try {
				System.out.println("1 begin 运行开始了,时间为:"+new Date());
				Thread.sleep(20000);
				System.out.println("1 end 运行结束了,时间为:"+new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static class MyTask2 extends TimerTask{
		@Override
		public void run() {
			System.out.println("2 begin 运行开始了,时间为:"+new Date());
			System.out.println("运行了时间为:"+new Date());
			System.out.println("2 end 运行结束了,时间为:"+new Date());
		}
		
	}
	
	public static void main(String[] args) throws ParseException {
		MyTask1 task1 = new MyTask1();
		MyTask2 task2 = new MyTask2();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString1 = "2014-12-12 11:33:00";
		String dateString2 = "2014-12-12 11:33:00";
		Date dateRef1 = sdf1.parse(dateString1);
		Date dateRef2 = sdf2.parse(dateString2);
		System.out.println("字符串1时间为:"+dateRef1.toLocaleString()+"当前时间:"+new Date().toLocaleString());
		System.out.println("字符串2时间为:"+dateRef2.toLocaleString()+"当前时间:"+new Date().toLocaleString());
		timer.schedule(task1, dateRef1);
		timer.schedule(task2, dateRef2);
	}
	
	
}
