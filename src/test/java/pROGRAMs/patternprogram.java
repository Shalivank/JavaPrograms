package pROGRAMs;

import org.testng.annotations.Test;

public class patternprogram {
@Test
public void str()
{
	String s="bharati";
	for(int i=1;i<s.length()-1;i++)
	{
		for(int j=1;j<s.length();j++)
		{
			System.out.print(s.charAt(j));
		}
	}
		
		
		
		
		

}
@Test
public void string() {
	char ch='a';
	for(int i=1;i<ch;i++)
	{
		for(int j=1;j<ch;j++)
		{
			for(int p=i+1;p<=j;p++)
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					System.out.println(ch);
				}
			}
			
		}
	}
}

}
