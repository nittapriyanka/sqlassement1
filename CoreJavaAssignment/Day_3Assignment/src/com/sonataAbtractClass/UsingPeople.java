package com.sonataAbtractClass;

public abstract class UsingPeople {
	
	public static void main(String arg[]) {
		
		
		Employee e1 = new TechnicalEmployee(144, "name", 400, 4,"c");
		//TechnicalEmployee t1 = new TechnicalEmployee();
		
		
		Address e2 = new Address();
		e2.setCity("Vizag");
		e2.setState("Ap");
		e2.setPin(543301);
		
		e1.setEmpid(123);
		e1.setEname("Spring");
		e1.setBasicpay(400);
		e1.setNoofleavesavailable(4);
		e1.setObj(e2);
		
		System.out.println(e1);
		System.out.println(e1.getPay(10));
		System.out.println(e1.getBasicpay());
		
		///TechnicalEmployee t1 = new TechnicalEmployee();
		System.out.println(e1.getPay(700));
		
		StaffMember s1 = new StaffMember(122, "france",400, 4,"clerk");
		s1.setObj(e2);
		System.out.println(s1.getPay(200));
		System.out.println(s1);
				
		
	
	}

}
