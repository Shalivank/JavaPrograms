package org.patterns;

import org.testng.annotations.Test;

public class Pattern123 {
	@Test
	public void main() {
		System.out.println("****PATTERN**********");
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
