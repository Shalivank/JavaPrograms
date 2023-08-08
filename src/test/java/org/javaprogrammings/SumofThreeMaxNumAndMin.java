package org.javaprogrammings;

import org.testng.annotations.Test;

public class SumofThreeMaxNumAndMin {
	@Test
	public void firstThreeMinSum()
	{
		int[] arr = { 8, 3, 4, 32, 2, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		int sum=0;
		for(int i=0; i<=2;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("sum of first three min"+" "+sum);
		
}
	@Test
	public void firstThreeMaxSum()
	{
		int[] arr = { 8, 3, 4, 32, 2, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		int sum1=0;
		for(int i=0; i<=2;i++)
		{
			sum1=sum1+arr[i];
		}
		
		System.out.println("sum of first three max"+" "+sum1);
		
}
}