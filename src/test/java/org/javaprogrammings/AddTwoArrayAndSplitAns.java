package org.javaprogrammings;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class AddTwoArrayAndSplitAns {
	@Test
	public void main() {
		int[] a = { 10, 22, 43, 111};
		int[] b = { 5, 24, 7, 22 };
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
		ArrayList<Object> arr = new ArrayList<>();
		for (int k = 0; k < c.length; k++) {
			if (c[k] > 9) {
				String g = Integer.toString(c[k]);
				char[] d = g.toCharArray();
				for (int h = 0; h < d.length; h++) {

					arr.add(d[h]);
				}

			} else {
				arr.add(c[k]);
			}
		}
		System.out.println(arr);
	}

}
