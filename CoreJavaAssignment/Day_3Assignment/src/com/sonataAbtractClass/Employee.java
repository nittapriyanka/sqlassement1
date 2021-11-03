package com.sonataAbtractClass;

public abstract class Employee {
	
	 int empid;
	String ename;
	 double Basicpay;
	 double Noofleavesavailable;
	  Address obj;
	
	public Employee(int empid,String ename,double Basicpay,double Noofleavesavailable) {
		this.empid=empid;
		this.ename=ename;
		this.Basicpay=Basicpay;
		this.Noofleavesavailable=Noofleavesavailable;
		
	}
	
	
	
	



	







	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", Basicpay=" + Basicpay + ", Noofleavesavailable="
				+ Noofleavesavailable + ", obj=" + obj + ", getEmpid()=" + getEmpid() + ", getEname()=" + getEname()
				+ ", getBasicpay()=" + getBasicpay() + ", getNoofleavesavailable()=" + getNoofleavesavailable()
				+ ", getObj()=" + getObj() + "]";
	}















	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public double getBasicpay() {
		return Basicpay;
	}



	public void setBasicpay(double basicpay) {
		Basicpay = basicpay;
	}



	public double getNoofleavesavailable() {
		return Noofleavesavailable;
	}



	public void setNoofleavesavailable(double noofleavesavailable) {
		Noofleavesavailable = noofleavesavailable;
	}



	public Address getObj() {
		return obj;
	}



	public void setObj(Address obj) {
		this.obj = obj;
	}



	public abstract  double getPay(double i);  
    	//return Basicpay;
    
	
	
	
}	