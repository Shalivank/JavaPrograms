package practice;

import org.testng.annotations.Test;

public class Count {
		@Test
		public void main() {
			String s="Shalivan";
			s=s.toLowerCase();
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
				if(ch=='a')
				{
					count++;
				}
			}
			System.out.println(count);
		}
}
