package org.javaprogrammings;

import org.testng.annotations.Test;

public class BubbleSort {
	@Test
	/**
	 * this method is used to sort the array in ascending order
	 */
	public void sort() {
		int[] arr = { 8, 3, 4, 32, 2, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("asceding completed");
		System.out.println("descending starts");
	}

	@Test
	/**
	 * this method is used to sort the array in descending order
	 */
	public void sort1() {
		int[] arr = { 8, 3, 4, 32, 2, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	@Test
	/**
	 * this method is used to sort the array in ascending order and also save the
	 * time also for multiple iterations
	 */
	public void sort2() {
		int[] arr = { 8, 3, 4, 32, 2, 4, 5 };
		System.out.println("to save the time");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	@Test
	/**
	 * this method is used to sort the array in ascending order and also save the
	 * time also for multiple iterations
	 */
	public void sort3() {
		int[] arr = { 8, 3, 4, 32, 2, 4, 5 };
		System.out.println("descending order and also save the time");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
