package com.sonataAbtractClass;

public  class TechnicalEmployee extends Employee {
	
	
	private String Technicalskill;
	
	TechnicalEmployee(int empid, String ename, double Basicpay, double Noofleavesavailable, String Technicalskill)
	{
	
	super(empid,ename,Basicpay, Noofleavesavailable);
	this.Technicalskill=Technicalskill;

} 
	
		// TODO Auto-generated constructor stub
	

@Override
public double getPay(double i) {
	
	  return getBasicpay() *(0.12)+i;
	// TODO Auto-generated method stub
	  
	  
	
}

@Override
public String toString() {
	return "TechnicalEmployee [Technicalskill=" + Technicalskill + ", empid=" + empid + ", ename=" + ename
			+ ", Basicpay=" + Basicpay + ", Noofleavesavailable=" + Noofleavesavailable + ", obj=" + obj + "]";
}

 
	
	}





	
