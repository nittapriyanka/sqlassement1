package com.sonata1;

public class Tester {

	
	

	private double empSal = 500;

	//private double empSal;

	Tester(int empid,String empname,double sal)
	{
		super();
		
		
	}
	
	public double totalsal(double TA,double HRA,double DRA)
	{
		
		return this.empSal+ TA+HRA+DRA;
	}
}
