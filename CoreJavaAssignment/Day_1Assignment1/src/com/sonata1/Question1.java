package com.sonata1;

public class Question1 {
	public static void main(String arg[])
	{
		int a = 12, b = 25, c = 89;
		
		if((a>b)&&(a>c)) // checking greater than between a and b and a and c
			System.out.println("Greater Number is" + a);
		else if((b>c)&&(b>a)) // checking greater than between b and c , b and a
			System.out.println("Greater Number is" + b);
		else
			System.out.println("Greater Number is" + c);
			
	}

}
