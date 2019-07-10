package com.cruds.demo;

public class Dog extends Animal implements IVehicle{
	
	public void talk() {
		System.out.println("Bow Bow!!");
	}
	
	public void WagTail() {
		System.out.println("Dog's wag tail");
	}

	
	
//	@Override
//	public void eat() {
//		System.out.println("Eats pedigree");
//	}
	
	
	public void start() {
		System.out.println("Dog Walking");
	}

	@Override
	public void stop() {
		System.out.println("Dog Stopping");
	}
	
	

}
