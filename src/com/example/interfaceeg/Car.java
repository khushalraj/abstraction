package com.example.interfaceeg;

public class Car implements Engine{
	
	@Override
	public void engineBreak() {
	System.out.println("car break");
		
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.engineBreak();
		
	}

}
