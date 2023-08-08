package org.javaprogrammings;

import org.testng.annotations.Test;

public class FandSMinNo {
	@Test
	public void minimun() {
		int[] arr= {2,3,3,5,1};
		int fm=10;;
		int sm=10;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<fm)
			{
				sm=fm;
				fm=arr[i];
			}
			else if(arr[i]<sm)
			{
				sm=arr[i];
			}
		}
		System.out.println(fm);
		System.out.println(sm);
	}
}
