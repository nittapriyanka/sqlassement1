package com.sonata1Shop;

public class MyAutoShop {             // main class
	
	public static void main(String arg[])
	{
		Sedan s1 = new Sedan(300,400,"red",30);   //  object
		Ford f1 = new Ford(300,300,"black",2021,35);
		Car c1= new Car(199,100,"white");
		Truck t1=new Truck(500,40,"aqua",33);
		
		System.out.println("Sedan" + s1.getSalePrice()); // displays grtSalePrice
		System.out.println("Ford" + f1.getSalePrice());
		System.out.println("Tuck" + t1.getSalePrice());
		System.out.println("Car" + c1.getSalePrice());
		
		
	}
}



