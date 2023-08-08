package stringPrograms;

import org.testng.annotations.Test;

public class FindTheMaxLengthInIntArray {
	@Test
	public void main() {
		int[] s= {12344, 234, 12345, 456, 789, 98, 76, 54};
		 int max = Integer.toString(s[0]).length();
		for(int i=0; i<s.length;i++)
		{
			if(Integer.toString(s[i]).length()>max)
			{
				max=Integer.toString(s[i]).length();
			}
	}
		for(int i=0; i<s.length;i++)
		{
			if(Integer.toString(s[i]).length()==max)
			{
				System.out.println(s[i]);
			}
		}
}
	@Test
	public void main1() {
		int[] s= {12344, 234, 12345, 456, 789, 98, 76, 54};
		  String max = Integer.toString(s[0]);
		for(int i=0; i<s.length;i++)
		{
			if(Integer.toString(s[i]).length()>max.length())
			{
				max=Integer.toString(s[i]);
			}
	}
		for(int i=0; i<s.length;i++)
		{
			if(Integer.toString(s[i]).length()==max.length())
			{
				System.out.println(Integer.toString(s[i]));
			}
		}
}
}