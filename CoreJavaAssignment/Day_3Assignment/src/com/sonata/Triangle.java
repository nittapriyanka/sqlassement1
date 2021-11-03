package com.sonata;

public class Triangle extends Shape{
	
	Triangle(double length,double height,double width){
		super(length,height,width);
	}
	
	public double area() {
		super.area();
	    
		double area = (height*width)/2;
		return  area;
	}
     public static void main(String args[]) {
    	 Triangle t1 = new Triangle(3,5,6);
    	 System.out.println(t1.area());
    	 t1.display();
     }
}
