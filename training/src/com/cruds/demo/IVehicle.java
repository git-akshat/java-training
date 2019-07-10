package com.cruds.demo;

public interface IVehicle {
	
	//by default public static final
	public static final String LUXURY_TYPE = "LUXURY";
	String PASS_TYPE = "PASSENGER";
	String PET_TYPE = "PET";
	
	//by default public and abstract
	public void start();
	public void stop();
	
}


