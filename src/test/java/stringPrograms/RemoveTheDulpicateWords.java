package stringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveTheDulpicateWords {
	@Test
	public void remove() {
		String s="Tester";
		String s1=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0; i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		System.out.println(set);
	}
}
