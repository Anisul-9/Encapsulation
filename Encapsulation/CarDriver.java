package com.jsp.Encapsulation;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car ("Bmw","x1","white",9000000);
		c1.printCarDetails();
		c1.setEngine(new Engine("M5","2500cc"));
		c1.printCarDetails();
	}

}
