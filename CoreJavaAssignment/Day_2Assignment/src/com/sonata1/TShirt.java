package com.sonata1;

public class TShirt {
	
	 
	String color;
	String material;
	String design;
	private int size;
	
	
	TShirt(){}
	
	
	TShirt(String a,String b,String c)
	{
		this.color=a;
		this.material=b;
		this.design=c;
		 
		
	}
	
	public boolean size(int a,int b,int c)
	{
		if(size <10){
			System.out.println("small");
		}
		else if(size>=32)
		{
			System.out.println("large");//return size;
		}
		else {
			System.out.println("extralarge");
		}
		return false;
	}
	
	public void display() {
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
	}
	
	
	public static void main(String arg[])
	{
		TShirt t1= new TShirt();
		t1.color = "white";
		t1.material = "cotton";
		t1.design= "crop";
		t1.display();
		
		
		TShirt t2 = new TShirt("blue","cotton","slogan");
		
		TShirt t3 = new TShirt("aqua","fabric","custom");
		t2.display();
		t3.display();
		System.out.println(t1.size(14,15,19));
	}
	

}
