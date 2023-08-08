package stringPrograms;

import org.testng.annotations.Test;

public class FindTheLengthInStringArray {
		@Test
		public void find()
		{
			String[] s= {"abcdef", "eff", "dertd", "ab"};
			int min=10;
			for(String ab:s)
			{
				
				for(int i=0; i<ab.length();i++)
				{
					if(ab.length()<min)
					{
					min=ab.length();
					}
				}
			}
			System.out.println(min);
			
		}
		@Test
		public void search() {
			String[] s= {"abcdef", "eff", "dertd", "bc", "ab","adsedrff"};
			String min=s[0];
			for(int i=0; i<s.length;i++)
			{
				if(s[i].length()<=min.length())
				{
					min=s[i];
				}
			}
			System.out.println(min);
		}
		
		@Test
		public void main() {
			String[] s= {"abcdef", "eff", "dertd", "bc", "ab","adsesd"};
			String minl=s[0];
			for(int i=0; i<s.length;i++)
			{
				if(s[i].length()<minl.length())
				{
					minl=s[i];
				}
			}
			for(int i=0;i<s.length;i++)
			{
				if(s[i].length()==minl.length())
				{
					System.out.println(s[i]);
				}
			}
		}
}
