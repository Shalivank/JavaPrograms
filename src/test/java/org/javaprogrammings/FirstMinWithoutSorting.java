package org.javaprogrammings;

import org.testng.annotations.Test;

public class FirstMinWithoutSorting {
	@Test
	public void FirstMin() {
		int[] arr = { 4, 5, 2, 6, 77, 4, 67, 34 };
		int fmin= arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < fmin) {
				fmin = arr[i];
			}
		}
		System.out.println(fmin);
	}
}
