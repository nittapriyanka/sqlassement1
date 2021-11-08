package com.sonata1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;




public class EmployeeImpI implements EmployeeInt {
	
	List <Employee> l1 = new LinkedList<Employee>();

	@Override
	public void addEmployee(Employee o) {
		// TODO Auto-generated method stub
	l1.add(o);	
	}

	@Override
	public void removeEmployee(Employee o) {
		// TODO Auto-generated method stub
		l1.remove(o);
	}
	
	public double yearSalary(Employee e1)
	{
		double yearSalary = e1.EmpSalary*12;
		return yearSalary;
	}

	

	@Override
	public List<Employee> getEmployee() {
		
		
		Iterator<Employee> i1 = l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	
		// TODO Auto-generated method stub
		return null;
	}

	public double yearSalary1(Employee e1) {
		double yearsal = 0;
		for(Employee e:l1)
		{
			yearsal = e.getEmpSalary()*12;
			System.out.println(e+"  "+"Annual Sal "+yearsal);
	
	
	
	
}
		return yearsal;
}
}