package org.javaprogrammings;

import org.testng.annotations.Test;

public class FirstAndSecondMaxWithoutSort {
	@Test
	public void FirstAndSecondMax()
	{
		int[] arr= {77,4,5,2,6,67,4,34};
		//	int[] arr= {4,1,3,2,5};
		int fmax=arr[0];
		int smax=arr[0];
		int tmax=arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>fmax)
			{
				fmax=arr[i];
			}
			else if(arr[i]>smax)
			{
				smax=arr[i];
			}
			else if(arr[i]>tmax)
			{
				tmax=arr[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);

	}
}
