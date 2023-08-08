package pROGRAMs;

import org.testng.annotations.Test;

public class String231 {
	@Test
	public void st2() {
		String s[] = { "my", "name", "is", "king", "queen" };

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i].compareTo(s[j]) < 0) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;

				}
			}
		}
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + " ");
	}

}
