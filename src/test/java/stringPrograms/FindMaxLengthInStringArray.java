package stringPrograms;

import org.testng.annotations.Test;

public class FindMaxLengthInStringArray {
	@Test
	public void main() {
		String[] s= {"abcdef", "eff", "dertd", "bc", "ab","adsesd"};
		String maxl=s[0];
		for(int i=0; i<s.length;i++)
		{
			if(s[i].length()>maxl.length())
			{
				maxl=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==maxl.length())
			{
				System.out.println(s[i]);
			}
		}
	}
}
