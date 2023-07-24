package com.jsp.Encapsulation;

public class Engine {
	private String brand;
	private String cubic_capacity;
	
	
	public Engine(String brand,String cc) {
		this.brand=brand;
		this.cubic_capacity=cc;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		if(brand==null) {
			System.out.println("null is not");
		}else {
		this.brand = brand;
		}
	}
	public String getCubic_capacity() {
		return cubic_capacity;
	}
	public void setCubic_capacity(String cubic_capacity) {
		this.cubic_capacity = cubic_capacity;
	}
	
	public void printEngine() {
		System.out.println("engine");
		System.out.println("cubnic_capacity");
		System.out.println("brand");
		System.out.println("price   ");
	}

}
