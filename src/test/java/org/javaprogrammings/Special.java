package org.javaprogrammings;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Special {
	@Test
	public void test()
	{
		
		for(; ;)
		{
		int no=new Scanner(System.in).nextInt();

		if(no%5==0 && no%3==0)
		{
			System.out.println("HiHello");
		}
		
		else if(no%3==0)
		{
			System.out.println("Hi");
		}


		else if(no%5==0)
		{
			System.out.println("Hello");
		}

		else if(no%5!=0 && no%3!=0) //else
		{
			System.out.println("Bye");
		}
	}
	}
}

