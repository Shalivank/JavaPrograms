package stringprogrmas;

import java.util.LinkedHashSet;

public class CountDuplicates {

	public static void main(String[] args) {
		String s = "hi java hello java hi java";
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		int c=0;
		for (String st : set) {
			int count = 0;
			for (int i = 0; i < s1.length; i++) {
				if (st.equals(s1[i])) {
					count++;
				}
			}
			if(count>1)
			{
				c++;
		
			}
			System.out.println(st+" "+c);
		}
		
		
	}
}
