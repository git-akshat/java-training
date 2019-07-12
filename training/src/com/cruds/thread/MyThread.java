package com.cruds.thread;

public class MyThread extends Thread{
	
	public MyThread(String name) 
	{
		super(name);
	}

	@Override
	public void run() {

		//System.out.println(Thread.currentThread() + "Run Method"); //child thread
		
		for(int i=5; i>0; i--) {
			System.out.println(Thread.currentThread() + "" + i); //child thread
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread()  + "Exist"); //child thread
	}
	
	

}
