package zoosvatt;

public class JW2 {
	public static void main(String[] args) {
		String s1 = "malayalam";
		String s2 = "al";
		int count = 0;
		for (int i = 0; i < s1.length() - s2.length(); i++) {

			if (s2.equals(substring(i, i + s2.length(), s1))) {
				count++;
			}
		}
		System.out.println("Substring " + s2 + " is present " + count + " times");
	}
		public static String substring(int i, int j, String s1) {
			String s2 = "";
			for (int k = i; k < j; k++) {
				s2 = s2 + s1.charAt(k);
			}
			return s2;

	}
}
