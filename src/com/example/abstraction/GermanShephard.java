package com.example.abstraction;

public class GermanShephard extends Dog{
	
	@Override
	void bark() {
		System.out.println(" GermanShephard bark ");
		
	}
	public static void main(String[] args) {
		GermanShephard  germanShephard  = new GermanShephard();
		germanShephard.bark();
		
	}

}
