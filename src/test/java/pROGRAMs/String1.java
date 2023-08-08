package pROGRAMs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class String1 {
	@Test(invocationCount =3)
	
	public void s() {
		String a = "bh12rati";
		int sum = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				int ch = a.charAt(i) - 48;
				sum = ch + sum;
			}
		}
		System.out.println(sum + " ");
	}

	@Test
	public void s2() {
		String s = "bha24rat40";
		int sum = 0;
		int tsum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int ch = s.charAt(i) - 48;
				tsum = tsum * 10 + ch;

			} else {
				sum = sum + tsum;
				tsum = 0;
			}
		}
		sum = sum + tsum;
		System.out.println(sum);
	}

	@Test
	public void s3() {
		String a = "Bharati";
		for (int i = 0; i < a.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(Character.toUpperCase(a.charAt(i)));
			} else {
				System.out.print(Character.toLowerCase(a.charAt(i)));
			}
		}

	}

	@Test
	public void s4() {
		String s = "bharati";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);
	}

	@Test
	public void s5() {
		String s = "i love shali";
		String[] st = s.split(" ");
		String temp = st[0];
		st[0] = st[st.length - 1];
		st[st.length - 1] = temp;
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
	}
	
	@Test
	public void s6()
	{
		String s="bharati";
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character set1:set)
		{
			System.out.print(set1);
		}
		System.out.println(" ");
	}
	@Test
	public void s7()
	{
		String s="bharati";
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
	for (Character ch : set) {
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i)) {
				count++;
			}
		}
		if(count>1)
		System.out.println(ch+" "+count);
		
	}
	}
	

}
