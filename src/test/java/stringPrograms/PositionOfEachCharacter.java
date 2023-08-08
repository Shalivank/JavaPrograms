package stringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PositionOfEachCharacter {
	@Test
	public void printUniqueValues() {
		String s = "tester";
//	LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i)+"  "+(i+1));
		}
		
	}
}