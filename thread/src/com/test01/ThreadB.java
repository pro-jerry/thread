package com.test01;

public class ThreadB extends Thread{

	private MyList list;

	public ThreadB(MyList list) {
		super();
		this.list = list;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try{
			while(true){
				if(list.size()==5){
					System.out.println("==5到了,线程B要退出了");
					throw new InterruptedException();
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
