package com.cruds.thread;

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		MyThreadR obj1 = new MyThreadR("Child Thread 1");
		MyThreadR obj2 = new MyThreadR("Child Thread 2");
		
		try {
			obj1.t.join();
			obj2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread() + " Exiting");
		
	}

}
