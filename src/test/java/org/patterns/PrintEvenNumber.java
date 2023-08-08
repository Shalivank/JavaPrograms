package org.patterns;

import org.testng.annotations.Test;

public class PrintEvenNumber {
@Test
public void main() {
	int n=5;
	for(int i=1,k=0;i<=n;i++,k+=4)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
}
