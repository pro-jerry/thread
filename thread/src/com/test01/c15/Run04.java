package com.test01.c15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run04 {

	static int i=0;
	public static class MyTask extends TimerTask{
		@Override
		public void run() {

			System.out.println("正常执行了"+i);
		}
	}
	public static void main(String[] args) {
		while(true){
			try {
				i++;
				Timer timer = new Timer();
				MyTask task = new MyTask();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateString = "2017-03-11 23:10:00";
				Date dateRef = sdf.parse(dateString);
				timer.schedule(task, dateRef);
				timer.cancel();
			} catch (Exception e) {

			}
		}
	}
}
