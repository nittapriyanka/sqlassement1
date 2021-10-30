package com.sonata1;

public class Student {
	int stdID;
	String stdName;
	int stdClass;
	
	Student(){}
	Student(int a,String b,int c){
		this.stdID = a;
		this.stdName = b;
		this.stdClass = c;
	}
	
	public void display() {
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdClass);
	}
	
	
	public static void main(String arg[])
	{
		Student s1 = new Student(11,"Ricky",5);
		
		Student s2 = new Student();
		s2.stdID=22;
		s2.stdName="Rekha";
		s2.stdClass=10;
		s1.display();
		s2.display();
		
		 
	}

}
