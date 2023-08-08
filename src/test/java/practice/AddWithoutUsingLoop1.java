package practice;

import org.testng.annotations.Test;

public class AddWithoutUsingLoop1 {
	@Test
	public void add() {
		int no=5678;
		int sum=0;
		if(no!=0)
		{
			sum=no%10+(no/10)%10+(no/100)%10+(no/1000);
		}
		System.out.println(sum);
	}
}
