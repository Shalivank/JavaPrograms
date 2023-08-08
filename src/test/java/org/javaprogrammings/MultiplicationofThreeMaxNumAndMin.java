package org.javaprogrammings;

import org.testng.annotations.Test;

public class MultiplicationofThreeMaxNumAndMin {
	@Test
	public void firstThreeMinMultiplication()
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
		
		int mul1=1;
		for(int i=0; i<=2;i++)
		{
			mul1=mul1*arr[i];
		}
		
		System.out.println("multiplication of first three min"+"  "+mul1);
		
}
	@Test
	public void firstThreeMaxMultiplication()
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
		
		int mul=1;
		for(int i=0; i<=2;i++)
		{
			mul=mul*arr[i];
		}
		
		System.out.println("multiplication of first three max"+" "+mul);
		
}
}
