package org.patterns;

import org.testng.annotations.Test;

public class Pattern2 {
	@Test
	public void main() {
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n; j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
