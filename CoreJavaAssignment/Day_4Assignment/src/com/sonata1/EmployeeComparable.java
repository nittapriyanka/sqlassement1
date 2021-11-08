package com.sonata1;

import java.util.Comparator;



public  class EmployeeComparable extends Employee implements Comparable<EmployeeComparable>
{
   
	  
	   
	 
		public int compareTo(Employee st) throws  MyOwnException {
			
			if(EmpId==st.EmpId) {
				throw new  MyOwnException("dublicates are there");
		
			}
			else
			return EmpId;
		
	}

		
		@Override
		public String toString() {
			return "EmployeeComparable [EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
		}


		@Override
		public int compareTo(EmployeeComparable o) {
			// TODO Auto-generated method stub
			return 0;
		}


		
		
		
	}
		
   

