package org.patterns;

import org.testng.annotations.Test;

public class Print54321 {
	@Test
	public void main() {
		System.out.println("****PATTERN**********");
		int n=5;
		for(int i=n; i>=0;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}