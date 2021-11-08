package com.sonata1;



public class UserEmployee {
	
	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.setEmpId(11);
		e.setEmpName("Sushma");
		e.setEmpSalary(555);
		//System.out.println(e);
		
		Employee e1 = new Employee();
		e1.setEmpId(11);
		e1.setEmpName("Sush");
		e1.setEmpSalary(200);
		
		EmployeeImpI l1 = new EmployeeImpI();
		l1.addEmployee(e);
		l1.addEmployee(e1);
		
		System.out.println(l1.getEmployee());
		l1.removeEmployee(e);
		System.out.println(l1.getEmployee());
		
		
		
		//for(Employee d  : Employee e1) {
		double sal = e.EmpSalary;{
		if(sal<10000) {
			sal=e.EmpSalary+5000;
			System.out.println("salary added " + sal);
		}
		else 
			System.out.println("salary " + sal);
		
		double sall = e1.getEmpSalary();
		sall = sall*12;
		System.out.println("yearly salary of employee e1  " + sall);
		
	}	

}
}
