package org.javaprogrammings;

import org.testng.annotations.Test;

public class FirstAndSecondMinWithDuplicates {
	@Test
	public void FirstAndSecondMax() {
		int[] arr = { 2,3,4, 5, 76,2, 6,77, 77, 4, 67, 34 };
		int fmin = arr[0];
		int smin = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= fmin) {
				if(arr[i]!=fmin)
				{
					smin=fmin;
				}
				fmin = arr[i];
			} else if (fmin==smin ||arr[i] < smin) {
			{
				smin = arr[i];
			}
		}
		}
		System.out.println(fmin);
		System.out.println(smin);
	}
}
