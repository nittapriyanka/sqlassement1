package com.sonata1;

public class product {
	
	int ProID;
	String ProName;
	double ProPrice;
	
	
	
	public double totalprice(double GST) {
		
		return this.ProPrice+ GST;
	}
	
	
	public void display() {
		System.out.println(ProID);
		System.out.println(ProName);
		System.out.println(ProPrice);
	}
	
	
	public static void main(String arg[]) {
		
		product p = new product();
		p.ProID=2121;
		p.ProName="LG";
		p.ProPrice=44556;
		p.display();
		System.out.println(p.totalprice(222));
		
	}

}
