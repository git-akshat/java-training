package com.cruds.demo;

public class Car implements IVehicle{

	@Override
	public void start() {
		System.out.println("Car Starting");
	}

	@Override
	public void stop() {
		System.out.println("Car Stopping");
	}

}
