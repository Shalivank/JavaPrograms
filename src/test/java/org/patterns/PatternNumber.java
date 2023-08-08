package org.patterns;

import org.testng.annotations.Test;

public class PatternNumber {
	@Test
	public void main() {
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n; j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print(j+" "+j);
				//	System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
