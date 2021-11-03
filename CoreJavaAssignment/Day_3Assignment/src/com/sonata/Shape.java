package com.sonata;

public class Shape {
	
	double length;
	double height;
    double width;
	//public static double area;
    
	Shape(){}
    Shape(double length,double height,double width)
    {
    	this.length=length;
    	this.height=height;
    	this.width=width;
    	
    }
    public  double area() {
    	
    	 double area = length*width;
    	 return area;
    }
    
   public  void display()
    {
    	System.out.println(length);
    	System.out.println(height);
    	System.out.println(width);
    }
    
    public static void main(String arg[])
    {
    	Shape s1= new Shape(4,5,6);
    	
    	System.out.println(s1.area());
    	s1.display();
    	
    }
}



