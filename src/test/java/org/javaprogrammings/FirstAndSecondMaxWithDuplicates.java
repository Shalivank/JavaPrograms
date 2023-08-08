package org.javaprogrammings;

import org.testng.annotations.Test;

public class FirstAndSecondMaxWithDuplicates {
	@Test
	public void FirstAndSecondMax() {
		int[] arr = { 4, 5, 76,2, 6,77, 77, 4, 67, 34 };
		int fmax = arr[0];
		int smax = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= fmax) {
				if(arr[i]!=fmax)
				{
					smax=fmax;
				}
				fmax = arr[i];
			} else if (fmax==smax ||arr[i] > smax) {
			{
				smax = arr[i];
			}
		}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}
}
