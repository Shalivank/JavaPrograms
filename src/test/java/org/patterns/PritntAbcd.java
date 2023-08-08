package org.patterns;

import org.testng.annotations.Test;

public class PritntAbcd {
	@Test
	public void main() {
		System.out.println("****PATTERN**********");
		//int n=5;
		char ch ;

		for(char i=a; i<=z;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
				{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
	}
}
}