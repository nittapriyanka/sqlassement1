package com.sonataAbtractClass;

public  class StaffMember extends Employee {
	
	private String Title;
	
	StaffMember( int empid, String ename, double Basicpay,double Noofleavesavailable,String title)
	{
		super(empid, title,Basicpay, Noofleavesavailable);
		this.Title=title;
	}
	
	
	
	public double getPay(double i)
	{
		
		return getBasicpay() *(0.15)+i;
	}



	@Override
	public String toString() {
		return "StaffMember [Title=" + Title + ", empid=" + empid + ", ename=" + ename + ", Basicpay=" + Basicpay
				+ ", Noofleavesavailable=" + Noofleavesavailable + ", obj=" + obj + "]";
	}



	

}
