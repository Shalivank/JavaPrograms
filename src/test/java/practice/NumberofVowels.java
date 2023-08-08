package practice;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class NumberofVowels {
		@Test
		public void main() {
			String s = "KarNatAKa";
			String s1 = s.toLowerCase();
			int count =0;
			for(int i=0;i<s1.length();i++)
			{ 
				char ch=s1.charAt(i);
				if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					count++;
				}
			}
			System.out.println(count);
		}
		
		@Test
		public void main1() {
			String s11="unit testing framework tool and maven build tool testing";
			String[] s2 = s11.split(" ");
			LinkedHashSet<String> set = new LinkedHashSet<String>();
			for(int i=0;i<s2.length;i++)
			{
				set.add(s2[i]);
			}
			for(String ab:set)
			{
				System.out.print(ab+"  ");
			}
		}
}
