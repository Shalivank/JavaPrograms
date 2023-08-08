package org.javaprogrammings;

import org.testng.annotations.Test;

public class PrimeNumber {
	@Test
	public void main() {

		int[] a = { 3, 4, 5, 6, 2, 11 };

		for (int i = 0; i < a.length; i++) {
			int no = a[i];
			boolean flag = true;
			for (int j = 2; j < no; j++) {
				if (no % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(no);
			}
		}
	}

	@Test
	public void main1() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int j = 2;
			while (j <= n) {
				if (n % j == 0) {
					break;
				} else {
					j++;
				}
			}
			if (j == n) {
				System.out.println(n);
			}
		}
	}
}
