package org.patterns;

import org.testng.annotations.Test;

public class Pattern {
	@Test
	public void main() {
		System.out.println("****PATTERN**********");
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	@Test
	public void main1() {
		System.out.println("****PATTERN**********");
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	@Test
	public void main2() {
		System.out.println("****PATTERN**********");
		int n=5;
		for(int i=n; i>=0;i--)
		{
			for(int j=i;j<=1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
