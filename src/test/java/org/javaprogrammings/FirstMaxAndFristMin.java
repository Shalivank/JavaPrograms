package org.javaprogrammings;

import org.testng.annotations.Test;

public class FirstMaxAndFristMin {
	
	@Test
	public void firstMaxMin()
	{
		int[] arr = { 4,1,3,2,5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println(arr[arr.length-1]+" "+"first max value");
		System.out.println();
		System.out.println(arr[arr.length-3]+" "+"third max value");
		System.out.println();
		System.out.println(arr[arr.length-arr.length]+" "+"first min value");
		}
	}


