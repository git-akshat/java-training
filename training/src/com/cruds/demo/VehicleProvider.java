package com.cruds.demo;

public class VehicleProvider {
	
	public static IVehicle getVehicle(String type){
		if(type.equals(IVehicle.PASS_TYPE)) {
			return new Bus();
		}
		else if(type.equals(IVehicle.LUXURY_TYPE)) {
			return new Car();
		}
		else if(type.equals(IVehicle.PET_TYPE)) {
			return new Dog();
		}
		return null;
		
	}

}
