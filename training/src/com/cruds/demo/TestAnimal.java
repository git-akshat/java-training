package com.cruds.demo;

public class TestAnimal {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.talk();
		
		Dog d = new Dog();
		d.talk();
		
		Animal a2 = new Dog();
		a2.talk();
		
		Animal x1 = AnimalProvider.getAnimal("FAITHFUL");
		x1.talk();
		
		Animal x2 = AnimalProvider.getAnimal("CUTE");
		x2.talk();
		
	}

}
