package com.test04;

public class Test {

	public static void main(String[] args) {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.setName("A");
		a.start();
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.setName("B");
		notifyThread.start();
		SynNotifyMothedThread synNotifyMothedThread = new SynNotifyMothedThread(lock);
		synNotifyMothedThread.setName("C");
		synNotifyMothedThread.start();
	}
}
