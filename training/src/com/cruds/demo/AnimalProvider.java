package com.cruds.demo;

public class AnimalProvider {
	
	public static Animal getAnimal(String type) {
		if(type.equals("FAITHFUL")) {
			return new Dog();
		}
		if(type.equals("CUTE")) {
			return new Cat();
		}
		
		return new Animal();
	}

}
