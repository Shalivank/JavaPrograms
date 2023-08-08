package api.practice;

import org.testng.annotations.Test;

public class AddDiagonal {
		@Test
		public void add() {
			int[] [] a= {{1,2,3},{4,5,6},{7,8,9}};
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i][i];
			}
			System.out.println(sum);
		}
}
