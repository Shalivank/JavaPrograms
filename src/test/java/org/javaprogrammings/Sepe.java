package org.javaprogrammings;

import org.testng.annotations.Test;

public class Sepe {
	@Test
	public void seperate() {
		int[] arr = { 2, 0, 1, 3, 0, 0 };
		int[] temp = new int[arr.length];
		int m = 0;
		int n = (arr.length / 2);
		int o = (arr.length / 2) + 1;
		int p = (arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				temp[m] = 0;
				m++;
			} else if (arr[i] == 2) {
				temp[n] = 2;
				n++;
			} else if (arr[i] == 1) {
				temp[o] = 1;
				o++;

			} else if (arr[i] == 3) {
				temp[p] = 3;
				p--;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}
