package com.cruds.demo;

public class Bus implements IVehicle{

	@Override
	public void start() {
		System.out.println("Bus Starting");
	}

	@Override
	public void stop() {
		System.out.println("Bus Stopping");
	}
	

}
