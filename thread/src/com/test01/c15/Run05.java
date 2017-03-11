package com.test01.c15;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run05 {

	public static class MyTask extends TimerTask{
		@Override
		public void run() {

			System.out.println("运行了时间为:"+new Date());
		}
	}
	public static void main(String[] args) {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("当前时间:"+new Date().toLocaleString());
		timer.schedule(task, 5000);
	}
}
