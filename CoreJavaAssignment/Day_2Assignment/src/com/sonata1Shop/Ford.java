package com.sonata1Shop;

public class Ford extends Car {

	private int manufacturerdiscount;
	private int year;

	Ford(int speed, double regularPrice, String color, int year,int manufacturerdiscount)
	{
		super(speed,regularPrice,color);
		this.year=year;
	    this.manufacturerdiscount=manufacturerdiscount;
		
	}
	
	public double getSalePrice()
	{
		super.getSalePrice();
		return super.getSalePrice()-manufacturerdiscount;
	}
}	
	

	