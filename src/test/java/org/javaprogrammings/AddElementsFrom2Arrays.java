package org.javaprogrammings;

public class AddElementsFrom2Arrays {

	public static void main(String[] args) {
		int[] a = {1,2,3,7,9,9,9,9,9,9,9,9};
		int[] b = {1,2,3,6,5,7,8,9,1,1,1,1,1,1,1};

		int length = a.length;
		if (b.length>a.length) {
			length = b.length;
		}

		for (int i = 0; i < length; i++) {

			try 
			{
				System.out.print(a[i]+b[i]+" ");
			} 
			catch (Exception e) 
			{
				if (b.length>a.length) 
				{
					System.out.print(b[i]+" ");
				} 
				else 
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
