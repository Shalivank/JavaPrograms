package stringPrograms;

import org.testng.annotations.Test;

public class FindSuminGivenString {
		@Test
		public void main() {
			String s="abEwRTY@#$123";
			int sum=0;
			for(int i=0;i<s.length();i++)
			{
				char s1=s.charAt(i);
				if(Character.isDigit(s1))
				{
					int f=Integer.parseInt(String.valueOf(s1));
					sum=sum+f;
				}
			}
			
			System.out.println(sum);
		}
}
