package com.sonata1;

import java.util.List;



public interface EmployeeInt {
	
    public void addEmployee(Employee o);
	
	public void removeEmployee(Employee o);
	
	public double yearSalary(Employee e1);
	
	public List<Employee>getEmployee();

}
