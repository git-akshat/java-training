package com.cruds.demo;

public class TestAnimal {

	public static void main(String[] args) {

//		Animal a = new Animal();
//		a.talk();
//		
//		Dog d = new Dog();
//		d.talk();
//		
		
		Animal x1 = AnimalProvider.getAnimal("FAITHFUL");
		x1.start();
		
//		Animal x2 = AnimalProvider.getAnimal("CUTE");
//		x2.talk();
		
		// typecast
		// ((Dog) x2).WagTail(); //classCastException
		
//		if(x1 instanceof Dog) {
//			((Dog) x1).WagTail();
//		}
//		
//		if(x2 instanceof Dog) {
//			((Dog) x1).WagTail(); // it wont work
//		}
		
	}

}
