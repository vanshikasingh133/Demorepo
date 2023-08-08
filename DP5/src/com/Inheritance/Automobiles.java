package com.Inheritance;

public class Automobiles {
	int wheels = 4;
	String fuelType = "Petrol";

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("Model: " + myCar.model);
		System.out.println("Year: " + myCar.year);
		System.out.println("Fuel Type: " + myCar.fuelType);
		System.out.println("Number of wheels: " + myCar.wheels);
	}
}

class Car extends Automobiles {
	String model = "Sedan";
	int year = 2022;
}
