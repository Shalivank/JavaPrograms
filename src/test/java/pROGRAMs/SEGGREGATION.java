package pROGRAMs;

import org.testng.annotations.Test;

public class SEGGREGATION {
	@Test
	public void seg() {    
		String s = "BhAratI@123";
		String rev = " ";
		String spl = " ";
		String num=" ";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) < 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				//int ch = s.charAt(i) - 48;
				rev = rev + s.charAt(i);
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				num = num + s.charAt(i);
			}

			spl = spl + s.charAt(i);
		}
		System.out.println("THE SEGGREGATION OF STRING" + rev + " " + num + " " + spl);
	}

}
