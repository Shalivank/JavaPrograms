package stringPrograms;

import org.testng.annotations.Test;

public class Segrigation {
	@Test
	public void sagrigate() {
		String s = "abEY@#$123wRT";
		String apl = "", spl = "", num = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				apl = apl + s.charAt(i);
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				num = num + s.charAt(i);
			}

			else {
				spl = spl + s.charAt(i);
			}
		}
		System.out.println(apl + " " + num + " " + spl);
	}
}
