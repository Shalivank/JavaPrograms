package stringprogrmas;

public class A1B2C3 {
	public static void main(String[] args) {
		String s = "a1b2c3";
		for (int i = 1; i < s.length(); i = i + 2) {
			int ch = s.charAt(i) - 48;
			for (int j = 0; j < ch; j++) {
				System.out.print(s.charAt(i - 1));
			}
			System.out.println();
		}
	}
}
