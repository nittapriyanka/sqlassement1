package com.sonata1;

public class Manager extends Employee{
	
	Manager(int empid,String empname,double sal)
	{
		super(empid,empname,sal);
		
	}
	
	public double totalsal(double TA,double HRA,double DRA)
	{
		
		return this.empSal+ TA+HRA+DRA;
	}
}
