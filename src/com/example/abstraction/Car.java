package com.example.abstraction;

public class Car extends Vehicle{

	@Override
	void drive() {
		System.out.println(" car is a vehicle ");
		
	}
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.drive();
	}
}
