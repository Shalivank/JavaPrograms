package stringPrograms;

import java.util.LinkedHashSet;
import org.testng.annotations.Test;

public class RemoveduplicatesInaString {
	@Test
	public void Duplicate()
	{
		String s="tester";
		 LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for( Character ch:set)
		{
			System.out.println(ch);
		}
	}
	
	
}
