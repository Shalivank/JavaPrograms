package org.patterns;

import org.testng.annotations.Test;

public class PrintAbcd {
	@Test
	public void main() {
		System.out.println("****PATTERN**********");
		int n=7;
		char ch = 'A';
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
	}
}
