package org.patterns;

import org.testng.annotations.Test;

public class Print12345andDescnd {
	@Test
	public void main() {
		System.out.println("****PATTERN**********");
		int n=5;
		for(int i=n; i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
