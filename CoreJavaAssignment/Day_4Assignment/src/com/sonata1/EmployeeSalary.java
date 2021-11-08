package com.sonata1;

import java.util.List;

public class EmployeeSalary extends Employee{
	
	EmployeeSalary(int EmpId,String EmpName,double EmpSalary){
		super();
	}
	
	
	double EmpSalary;{
	if(EmpSalary<10000) {
		EmpSalary=EmpSalary+5000;
		System.out.println("salary added " + EmpSalary);
	}
	else 
		System.out.println("salary " + EmpSalary);}


	
	public double getEmpSalary1()
	{
		return(super.EmpSalary*12);
	}	
	
}
