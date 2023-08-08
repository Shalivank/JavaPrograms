package stringprogrmas;

import java.util.LinkedHashSet;

public class OrderOfOccuranceWithDuplicate {

	public static void main(String[] args) {
		String s="hi hi he he java sel";
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<s1.length;i++)
		{
			set.add(s1[i]);
		}
			for (String st:set) {
				for(int i=0; i<s1.length;i++)
				{
					if(st.equals(s1[i]))
					{
						System.out.println(st+" "+(i+1));
					}
				}
			}
	}

}
