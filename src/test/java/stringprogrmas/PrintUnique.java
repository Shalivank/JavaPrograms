package stringprogrmas;

import java.util.LinkedHashSet;

public class PrintUnique {

	public static void main(String[] args) {
		String s="hi hi he he java sel";
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		for (String st: set) {
			int count=0;
			for (int i = 0; i < s1.length; i++) {
				if(st.equals(s1[i]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(st+"==>"+count);
			}
		}
	}

}
