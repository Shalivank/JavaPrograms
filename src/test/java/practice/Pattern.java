package practice;

import org.testng.annotations.Test;

public class Pattern {
	@Test
	public void main() {
		for(int i=0;i<=4;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
