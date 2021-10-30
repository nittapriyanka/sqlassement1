package com.sonata1;

public class Question7 {
	
	public static void main(String arg[])
	{
		
		String s1="JaVAcOdE";
		int len = s1.length();
		String s2="";
		int i;
		char x;
		for(i=0;i<=len-1;i++)
		{
			x=s1.charAt(i);
			switch(x) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				s2=s2+'$';
				break;
				default:
					s2=s2+x;
		  }		
				
	  }
		System.out.println(s2);
	}

}
