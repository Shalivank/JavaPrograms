package pROGRAMs;

public class owels1 {

	public static void main(String[] args) {
		String s = "bharati";
		for (int i = 0; i < s.length(); i++) {
			boolean flag = true;
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(s.charAt(i));

			}
		}

	}
}