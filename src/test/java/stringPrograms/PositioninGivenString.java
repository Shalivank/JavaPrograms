package stringPrograms;

import org.testng.annotations.Test;

public class PositioninGivenString {
	@Test
	public void remove() {
		String s="i love love i bangalore city";
		String[] s2=s.split(" ");
		for(int i=0; i<s2.length;i++)
		{
		System.out.println(s2[i]+"   "+(i+1));
		}
		
	}
}
