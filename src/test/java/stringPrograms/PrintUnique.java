package stringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PrintUnique {
	@Test
	public void printUnique() {
		String s="i love love i bangalore city";
		String[] s2=s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0; i<s2.length;i++)
		{
			set.add(s2[i]);
		}
		for(String ab:set) {
			int count=0;
			for(int i=0;i<s2.length;i++)
			{
				if(ab.equals(s2[i]))
				{
					count++;
				}
			}
		if(count==1)
		{
			System.out.println(ab+" "+count);
		}
		}
	}
}
