package zoosvatt;

public class Stringaaaa {
	 int a;
	
	public static void main(String[] args) {
		String s1 = "rtsgrtrtpabcdrtp";
		String s2 = "rtp";
		int index = -1;
		Stringaaaa s = new Stringaaaa();
		s.a=10;
		int b;
		
		for (int i = 0; i < s1.length() - s2.length(); i++) {
			if (s2.equals(substring(i, i + s2.length(), s1))) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
	public static String substring(int i, int j, String s1) {
		String s2 = "";
	
		for (int k = i; k < j; k++) {
			s2 = s2 + s1.charAt(k);
		}
		return s2;
	}
}
