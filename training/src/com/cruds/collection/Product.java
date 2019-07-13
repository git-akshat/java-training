package com.cruds.collection;

public class Product {
	
	private int pid;
	private String pname;
	private double price;
	
	public Product(int pid, String name, double price) {
		this.pid = pid;
		this.pname = name;
		this.price = price;
	}
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getName() {
		return pname;
	}
	
	public void setName(String name) {
		this.pname = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return this.pid;
	}

	@Override
	public boolean equals(Object obj) {
		
		Product other = (Product) obj;
		return this.pid == other.getPid() && this.pname == other.getName();
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + pname + ", price=" + price + "]";
	}
	
	
	

}
