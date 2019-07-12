package com.cruds.thread;

public class SyncDemo {
	
	public static void main(String[] args) {
		
		Printer p = new Printer();
		
		User u1 = new User(p, "Hello");
		User u2 = new User(p, "World");
		User u3 = new User(p, "Synchronized");
		
		
		try {
			u1.t.join();
			u2.t.join();
			u3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
