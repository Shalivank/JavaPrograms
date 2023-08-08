package stringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PositionReverseOeder {
	@Test
	public void printUniqueValues() {
		String s = "tester";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {

			for (int i =s.length()-1;i>=0;i--) {
				if (ch == s.charAt(i)) {

					System.out.println(ch + " is present in " + (i + 1)+" postion");
					break;
				}
			}
		}
	}
}
