package com.cruds.demo;

public class TestFly {
	
	public static void main(String[] args) {
		IFly f = FlyProvider.getFly(IFly.SUPER_FAST);
		f.fly();
	}

}
