package com.cruds.thread;

public class Clicker implements Runnable{
	
	long counter;
	Thread t;
	
	//tells compiler not to make local copy of shared variable
	volatile boolean running = true;
	
	public Clicker(int priority) {
		t = new Thread(this);
		t.setPriority(priority);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread() + "Run Method");

		while(running)
		{
			counter++;
		}
	}
		
		public void stop()
		{
			System.out.println(Thread.currentThread() + "Stop method");
			running = false;
		}
		
		public void start()
		{
			System.out.println(Thread.currentThread() + "start method");
			t.start();
		}

}
