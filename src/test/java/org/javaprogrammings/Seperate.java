package org.javaprogrammings;

import org.testng.annotations.Test;

public class Seperate {
	@Test
	public void seperate() {
		int[] arr = { 0, 0, 0,  1, 1, 2,2,0,3,2,2, 1, 1,3,3,3};
		int[] temp = new int[arr.length];
		int m =0;
		int n =(arr.length/2)-4;
		int o=(arr.length/2)                          ;
		int p=arr.length-1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				temp[m] = 0;
				m++;
			} else if (arr[i] == 1) {
				temp[n] = 1;
				n++;
			}
			else if(arr[i]==2)
			{
				temp[o]=2;
				o++;
			}
			else if(arr[i]==3)
			{
				temp[p]=3;
				p--;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}
