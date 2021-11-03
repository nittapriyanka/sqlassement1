package com.sonata1;

public class Developer {
	
	
	private static final double empSal = 400;

	Developer(int empid,String empname,double sal)
	{
		super();
		
	}
	
	public double totalsal(double TA,double HRA,double DRA)
	{
		return this.empSal+ TA+HRA+DRA;
	}

}
