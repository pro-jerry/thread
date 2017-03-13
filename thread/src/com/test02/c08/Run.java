package com.test02.c08;

public class Run {

	public static void main(String[] args) {
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group= new ThreadGroup(mainGroup, "A");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("runMethod");
				try {
					Thread.sleep(10000);//线程必须在运行状态才能受阻管理
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread newThread = new Thread(group, runnable);
		newThread.setName("Z");
		newThread.start();
		
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		System.out.println("main线程中有多少个子线程:"+listGroup.length+"名字为:"+listGroup[0].getName());
		Thread[] listThread = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listGroup);
		System.out.println(listThread[0].getName());
	}
}
