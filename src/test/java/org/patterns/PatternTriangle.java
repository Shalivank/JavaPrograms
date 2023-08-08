package org.patterns;

import org.testng.annotations.Test;

public class PatternTriangle {
	@Test
	public void main1() {
		System.out.println("****PATTERN**********");
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
