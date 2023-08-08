package pROGRAMs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class occccc {
	@Test
	public void oc1() {
		String s = "i love bharu bharu love";
		String[] st = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i = 0; i < st.length; i++) {
			set.add(st[i]);

		}
		for (String str : set) {
			int count = 0;
			for (int i = 0; i < st.length; i++) {
				if (str.equals(st[i])) {
					count++;
				}

			}
			if (count > 1) {
				System.out.print(str + "The duplicate String " + count);
			}
		}
	}

	@Test
	public void oc2() {
		String s = "tester";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character set1 : set) {
			// System.out.print(set1);
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (set1 == s.charAt(i)) {
					count++;

				}
			}
			if (count > 1) {
				System.out.println(set1 + "====>" + count);
			}
		}
	}

	@Test
	public void oc3() {
		String s = "bhariatiir";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character set1 : set) {
			// int count=0;
			for (int i = 0; i < s.length(); i++) {
				if (set1 == s.charAt(i)) {
					System.out.println(set1 + " " + "the position==>" + (i));
					// break;
				}
			}
		}
	}

	@Test
	public void oc4() {
		String s = "i love punith";
		String[] st = s.split(" ");
		String rev = "";
		for (int i = st.length - 1; i >= 0; i--) {
			rev = rev + st[i];
		}
		System.out.println(rev);
	}

	@Test
	public void oc5() {
		String s = "i love bharu";
		String[] st = s.split(" ");
		String temp = st[st.length - 1];
		st[st.length - 1] = st[0];
		st[0] = temp;
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}

	}

	@Test
	public void oc6() {
		String s = "bha123ti";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > '0' && s.charAt(i) < '9') {
				int n = s.charAt(i) - 48;
				sum = sum + n;
			}
		}
		System.out.println("The Sum is" + " " + sum);
	}

	@Test
	public void oc7() {
		String s = "bh34rar40";
		int sum = 0;
		int tsum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int n = s.charAt(i) - 48;
				tsum = tsum * 10 + n;
			} else {
				sum = sum + tsum;
				tsum = 0;

			}
		}
		sum = sum + tsum;
		System.out.println(sum);

	}

	@Test
	public void oc8() {
		String s = "the12@*BHaru$";
		String rev = " ";
		String num = " ";
		String spl = " ";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 'a' && s.charAt(i) < 'z' || s.charAt(i) > 'A' && s.charAt(i) < 'Z') {
				rev = rev + s.charAt(i);
			} else if (s.charAt(i) > '0' && s.charAt(i) < '9') {
				num = num + s.charAt(i);
			} else {
				spl = spl + s.charAt(i);
			}
		}
		System.out.println(rev + num + spl);
	}

	@Test
	public void oc9() {
		String s = "a1b2c3";
		for (int i = 1; i < s.length(); i = i + 2) {
			int ch = s.charAt(i) - 48;
			for (int j = 0; j < ch; j++) {
				System.out.print(s.charAt(i - 1));
			}
			System.out.println();

		}

	}

	@Test
	public void oc10() {
		String st = "bharati yaligar";
		String[] str = st.split(" ");
		for (int i = 0; i < str.length-1; i++) {
			if (i== 0) {
				System.out.print(Character.toUpperCase(st.charAt(i))+" ");
			} else {
				System.out.print(Character.toLowerCase(st.charAt(i))+" ");
			}
		}
	}

	@Test
	public void oc11() {
		String s="bharati yaligar banglore dharwad";
		String[] st = s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			if(i%2==0)
			{
				String str = st[i];
				for(int j=str.length()-1;j>=0;j--)
				{
					System.out.print(str.charAt(j));
				}
			}
			else
			{
				System.out.print(st[i]);
			}
			System.out.println(" ");
		}

	}

	@Test
	public void oc12()
	{
		String s="bharati yaligar";
		String[] st = s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			String str=st[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
		
	}
	@Test
	public void oc13()
	{
		String s="bharati";
		String st="";
		for(int i=0;i<s.length();i++)
		{
			st=st+s.charAt(i);
			System.out.println(st);
			//System.out.print(s.charAt(i)+" "+s.charAt(i+1));
		//	System.out.print(s.substring(0, i+1));
		
		}
		
		
	}
}
