package com.test01.c15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run03 {

	private static Timer timer = new Timer();
	private static int runCount = 0;
	public static class MyTask1 extends TimerTask{
		@Override
		public void run() {

			System.out.println("1 beign 运行了!时间为:"+new Date());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("1 end 运行了!时间为:"+new Date());
			runCount++;
			if(runCount==5){
				timer.cancel();
			}
		}
	}
	public static void main(String[] args) throws ParseException {
		MyTask1 task1 = new MyTask1();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = "2017-03-11 23:10:00";
		Date dateRef = sdf.parse(dateString);
		System.out.println("字符串时间:"+dateRef.toLocaleString()+"当前时间:"+new Date().toLocaleString());
		timer.scheduleAtFixedRate(task1, dateRef, 2000);
	}
}
