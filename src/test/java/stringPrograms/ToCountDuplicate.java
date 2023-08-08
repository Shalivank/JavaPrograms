package stringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class ToCountDuplicate {//also same as order of occurance program
	@Test
	public void countDuplicate() {
		String s = "tester";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch + " Is  Repeating " + count+ " "+"times");
		}
	}
}