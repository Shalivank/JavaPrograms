package stringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PrintDuplicateswithCount {
	@Test
	public void PrintDuplicatewithCount() {
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
			System.out.println(ch + " Is  Repeating " + count + " " + "times");
//			if (count > 1) {
//				System.out.println(ch + " Is  Repeating " + count + " " + "times");
//			}
		}
	}
}
