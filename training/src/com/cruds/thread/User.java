package com.cruds.thread;

public class User implements Runnable{

	Thread t;
	Printer p;
	String msg;
	
	public User(Printer p, String msg) {
		t = new Thread(this);
		this.p = p;
		this.msg = msg;
		t.start();
	}
	
	@Override
	public void run() {
		synchronized (p) {
			p.print(msg);
		}
		
	}
	
	

}
