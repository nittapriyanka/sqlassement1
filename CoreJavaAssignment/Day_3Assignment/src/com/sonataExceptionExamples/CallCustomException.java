package com.sonataExceptionExamples;

public class CallCustomException {
	
public static void main(String arg[]) throws  MyOwnException{
		
		int salary = 100000;
		if(salary<100000)
			throw new  MyOwnException("yearly salary is less than onelakh");
		else
			System.out.println("Approve");

}
}
