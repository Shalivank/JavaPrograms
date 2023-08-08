package org.javaprogrammings;

import org.testng.annotations.Test;

public class FirstMaxWithoutSorting {
	@Test
	public void FirstMax()
	{
		int[] arr= {4,5,2,6,77,4,67,34};
		int fmax=arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>fmax)
			{
				fmax=arr[i];
			}
		}
		System.out.println(fmax);
	}
}
