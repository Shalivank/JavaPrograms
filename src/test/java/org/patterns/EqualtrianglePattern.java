package org.patterns;

import org.testng.annotations.Test;

public class EqualtrianglePattern {
	@Test
	public void main() {
		int n=5;
		for(int i=n;i>=0;i--)
		{
			for(int j=1; j<=n;j++)
			{
				if(i<j)
				{
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
