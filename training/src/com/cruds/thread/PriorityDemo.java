package com.cruds.thread;

public class PriorityDemo {
	
	public static void main(String[] args) {
		
		Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
		Clicker low = new Clicker(Thread.NORM_PRIORITY - 2);
		
		low.start();
		hi.start();
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		hi.stop();
		low.stop();
		
		System.out.println("High counter " + hi.counter);
		System.out.println("Low counter " + low.counter);

	}

}
