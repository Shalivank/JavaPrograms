package org.javaprogrammings;

import java.util.Scanner;

public class ShiftingNoBasedOnKey {

	public static void main(String[] args) {
		for(;;)
		{
		int s=new Scanner(System.in).nextInt();
		int[] a = {1,2,3,4,5};
	//	int key = 1;
		for (int i = 0; i < s; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[a.length-1] = temp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
}
