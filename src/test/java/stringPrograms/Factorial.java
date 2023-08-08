package stringPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Factorial {
	@Test
	public void min() {

		for (;;) {
			int no = new Scanner(System.in).nextInt();
			// int no=5;
			int fact = 1;
			for (int i = no; i > 0; i--) {
				fact = fact * i;
			}
			System.out.println(fact);
		}
	}
}
