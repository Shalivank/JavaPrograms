package stringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicatesFromString {
	@Test
	public void Remove() {
		String s="indiaaa";
		int count=0;
		char[] ab = s.toCharArray();
		LinkedHashSet<Character> list = new LinkedHashSet<>();
		for(int i=0;i<ab.length;i++)
		{
			list.add(ab[i]);
		}
		for(Character ch:list)
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
				System.out.print(ch+" ");
			
			}
		}
		System.out.println(" is a vowels and it's count is "+count);
	}
}
