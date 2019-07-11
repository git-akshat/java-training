package com.crud.exception;

public class StudentException extends Exception{
	
	private String details;
	
	public StudentException(String details) {
		this.details = details;
	}

	public String getDetails() {
		return details;
	}
	
	

}
