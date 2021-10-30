package com.sonata1;

public class Question9
{
	public static void main(String arg[])
	{
		int arr[] = {1,2,2,4,6,4,6,8,8}, count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count=count+1;
					
				}
			}
		}
		System.out.print("dublicate numbers count is: " + count);
	}


}
