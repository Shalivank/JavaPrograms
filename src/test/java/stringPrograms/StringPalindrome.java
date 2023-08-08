package stringPrograms;

import java.util.Scanner;
import org.testng.annotations.Test;

public class StringPalindrome {
	@Test
	public void palindrome()
	{
		String s="mom";
		String rev="";
		for(int i=s.length()-1;i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not a palindrome");
		}
	}
	@Test
	public void reverse()
	{
		
	}
}
