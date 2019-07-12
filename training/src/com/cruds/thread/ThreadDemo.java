package com.cruds.thread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		MyThread obj1 = new MyThread("child 1");
		MyThread obj2 = new MyThread("child 2");
		obj1.start();
		obj2.start();
		
		for(int i=5; i>0; i--)
		{
			System.out.println("Main Thread " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main thread exit");
		
	}

}
