package pROGRAMs;

import org.testng.annotations.Test;

public class OWELS {
	@Test
	public void ovels()
	{
		String s[]= {"bharati","yaligar","garag"};
		for(int i=0;i<s.length;i++) {
			String s1 = s[i];
			int count=0;
			for(int j=0;j<s1.length();j++)
				
			{
				if(s1.charAt(j)=='a'||s1.charAt(j)=='e'||s1.charAt(j)=='i'||s1.charAt(j)=='o'
						||s1.charAt(j)=='u')
				{
					count++;
					System.out.print(s1.charAt(j)+" ");
				}
			}
			System.out.println("the ovels are"+count);
		}
	}

}
