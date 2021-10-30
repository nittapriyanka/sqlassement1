package com.sonata1;

public class Question10 {

	public static void main(String arg[])
	{
		int arr[] = {2,4,5,7,10},i,largest1, largest2, temp;
		
		largest1 = arr[0];
		largest2 =arr[1];
		
		if(largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
		
		for(i=2; i<arr.length;i++)
		{
			if(arr[i]>largest1)
			{
				largest2 = largest1;
				largest1 = arr[i];
			}
			else if(arr[i] > largest2 && arr[i]!=largest1)
			{
				largest2 = arr[i];
			}
		}
		System.out.println("First largest: " + largest1);
		System.out.println("second largest: " + largest2);
	}
}
