package com.sonata;

public class Square extends Shape{
	
	Square(double length,double height,double width){
		super(length,height,width);
	}
	
	public double area() {
		super.area();
		double area = length*length;
		return area;
	}
	
	public static void main(String arg[]) {
		Square s1 = new Square(3,4,5);
		System.out.println(s1.area());
		s1.display();
	}

}
