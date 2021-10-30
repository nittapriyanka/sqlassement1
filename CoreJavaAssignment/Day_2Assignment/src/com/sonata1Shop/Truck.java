package com.sonata1Shop;

public class Truck extends Car {
	
	private int weight; // sameclass
	
	public Truck(int speed,double regularPrice,String color,int weight) {
		
		super(speed,regularPrice,color);
		this.weight=weight;
	}
	
	public double getSalePrice() {
		return super.getSalePrice()*(weight>2000?0.85:0.75);
	}
	
}
	
	
	








