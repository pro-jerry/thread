package com.test02.c12;


public class ClientThread extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"=>"+sequence.getNumber());
        }
	}
	
	private Sequence sequence;
    public ClientThread(Sequence sequence){    
        this.sequence=sequence;
    }
}
