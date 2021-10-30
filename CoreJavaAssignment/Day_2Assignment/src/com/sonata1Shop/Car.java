package com.sonata1Shop;

public class Car  {
	
	private int speed;              //sameclass
	private  double regularPrice; 
    private String color;
    
    public Car(int speed , double regularPrice, String color) 
    {
    	 this.speed=speed;
		 this.regularPrice=regularPrice;
		 this.color=color;
    }
   
    
    public double getSalePrice() { 
    	return regularPrice;
    }
}  
    