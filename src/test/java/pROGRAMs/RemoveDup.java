package pROGRAMs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDup {
	@Test
	public void dup()
	{
		String s="testerh";
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character set1:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(set1==s.charAt(i))
				{
					count++;
					//System.out.println(set1+" "+(i));

				}
			}
			if(count==1)
			{
				System.out.println(count+"====>"+set1);
			}
		}
	}
	@Test
	public void withou()
	{
		String s="tester";
		String st = s;
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=i+1;j<st.length();j++)
			{
				int count=0;
				if(s.charAt(i)==st.charAt(j))
				{
				System.out.println(count+"===>"+st);	
				}
			}
		}
	}
    
}
