package com.cruds.demo;

public class TestVehicle {
	
	public static void main(String[] args) {
//		Car c = new Car();
//		c.start();
//		c.stop();
//		
//		IVehicle v = VehicleProvider.getVehicle("PASSENGER");
//		v.start();
//		v.stop();
		
		IVehicle v = VehicleProvider.getVehicle("PET");
		v.start();
		v.stop();
		
		
		
		
	}

}
