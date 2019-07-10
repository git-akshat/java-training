package com.cruds.demo;

public class FlyProvider {
	
	public static IFly getFly(String type) {
		if(type.equals(IFly.SUPER_FAST)) {
			return new Superman();
		}
		else if(type.equals(IFly.FAST)) {
			return new Aeroplane();
		}
		else if(type.equals(IFly.SLOW)) {
			return new Bird();
		}
		return null;
	}

}
