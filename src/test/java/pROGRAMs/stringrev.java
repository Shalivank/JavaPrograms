package pROGRAMs;

import org.testng.annotations.Test;

public class stringrev {
@Test
public void stringrev()
{
	String s="i love bharu";
	String[] st = s.split(" ");
	for(int i=0;i<=st.length-1;i++)
	{
		String st1 = st[i];
		for(int j=st1.length()-1;j>=0;j--)
		{
			System.out.print(st1.charAt(j));
		}
		System.out.println(" ");
	}
}
	
	
	
	@Test
	
	public void stringrev2() {
		String s="i love myself";
		String[] str=s.split(" ");
		for(int i=0;i<=str.length-1;i++)
		{
			String st2 = str[i];
			for(int j=st2.length()-1;j>=0;j--)
			{
				System.out.print(st2.charAt(j));
			}
			System.out.print(" ");
		}}
		@Test
		public void stringrev3()
		{
			String s="bharati";
			String rev=" ";
			for(int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
			System.out.println(rev);
		}

		@Test
		public void stringrev4()
		{
			String s="i love bhru";
			String[] s1 = s.split(" ");
			String temp=s1[0];
			s1[0]=s1[s1.length-1];
			s1[s1.length-1]=temp;
			for(int i=0;i<=s1.length-1;i++)
			{
				System.out.println(s1[i]);			}
			
			
			
		}
		
		
		
	}
	

