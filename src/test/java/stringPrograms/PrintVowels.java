package stringPrograms;

import org.testng.annotations.Test;

public class PrintVowels {

		@Test
		public void vowels() {
			String s="bangalore";
			int count=0;
			char[] ch = s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i'|| ch[i]=='o' || ch[i]=='u')
						{
					count++;
						}
			}
			System.out.println(count);
		
			
		}
}
