package pROGRAMs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagram {
	@Test
	public void ana()
	{
		String s="fried";
		String s1="fried";
		char[] s2 = s.toCharArray();
		char[] s3 = s1.toCharArray();
		Arrays.sort(s2);
		Arrays.sort(s3);
		String a=new String(s2);
		String b=new String(s3);
		if(a.equals(b)) {
			System.out.println("Ananagram");
		
		}
		else
		{
			System.out.println("not anagram");
		}}
}
		
