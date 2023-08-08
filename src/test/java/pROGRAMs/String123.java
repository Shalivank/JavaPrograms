package pROGRAMs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class String123 {
	@Test
	public void string()
	{
		
		String s = "my name is king";
		String[] s1 = s.split(" ");
		
		for (int i =0;i<s1.length;i++) {
			if(i%2==1) {
				String st=s1[i];
				for(int j=st.length()-1;j>=0;j--)
				{
					System.out.print(st.charAt(j));
				}
			}
			else
			{
				System.out.print(s1[i]);
			}
				System.out.print(" ");
		}}
		

		
		
		
		}
	


