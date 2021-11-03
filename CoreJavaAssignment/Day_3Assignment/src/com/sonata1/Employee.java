package com.sonata1;



  public  class Employee {
	
	int empId;
	String empName;
	double empSal;
	
	Employee(){}
	Employee(int empid,String empname,double sal){
		this.empId=empid;
		this.empName=empname;
		this.empSal=sal;
	}
	
	
	
   public double totalsalary(double TA,double HRA,double DA) {
		
		return this.empSal+ TA+HRA+DA;
		
}	
		
	public static void main(String arg[])
	{
		Employee e1 = new Employee(122,"ki",200);   
		Manager m1 = new Manager(133,"hi",300);
		Tester t1= new Tester(199,"white",400);
		Developer d1=new Developer(500,"aqua",500);
		System.out.println("employee" + e1.totalsalary(10,10,10));
		System.out.println("Manager" + m1.totalsalary(10,10, 10));
		System.out.println("tester" + t1.totalsal(10, 10, 10));
		System.out.println("developer" + d1.totalsal(10, 10, 10));
	}
	

}
