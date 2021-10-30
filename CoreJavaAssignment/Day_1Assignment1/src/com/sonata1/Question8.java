package com.sonata1;

public class Question8 {
	
	public static void main(String arg[])
	{
		int arr[] = {11,33,11,44,55,66,55,33};
		
		System.out.println("Dublicate numbers are : ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i] + " ");
					
				}
			}
		}
		
	}

}
