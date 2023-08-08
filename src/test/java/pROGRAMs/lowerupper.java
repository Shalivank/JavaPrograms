package pROGRAMs;

import org.testng.annotations.Test;

public class lowerupper {
	@Test
	public void uplp()
	{
		String s="BhaRati";
        char[] ch = s.toCharArray();
        int ch1 = s.length()-1;
        

		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)>'a' && s.charAt(i)<'z')
			{
				System.out.println(ch1);
			}
			
		} 
		}}
		
	