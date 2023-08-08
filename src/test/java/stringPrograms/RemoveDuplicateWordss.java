package stringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicateWordss {
	@Test
	public void remove() {
		String s="i love love i bangalore city";
		String[] s2=s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0; i<s2.length;i++)
		{
			set.add(s2[i]);
		}
		for(String ab:set) {
		System.out.println(ab);
		}
	}
}
