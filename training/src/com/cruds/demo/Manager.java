package com.cruds.demo;

public class Manager extends Employee{

	private String deptName;
	
	public Manager(int empId, String name) {
		super(empId, name);
		System.out.println("Manager's constructor");
	}
	
	private Manager(int empId, String name, String deptName) {
		this(empId, name);
		this.deptName = deptName;
	}

	
}
