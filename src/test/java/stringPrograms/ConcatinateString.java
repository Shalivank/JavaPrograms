package stringPrograms;

import org.testng.annotations.Test;

public class ConcatinateString {
		@Test
		public void String() {
			String s1="hi";
			String s2="hello";
			String s3="how are you";
			java.lang.String str = s3+" ".concat(s2+" ").concat(s1);
			System.out.println(str);
			
			//System.out.println(s1+" "+s2+" "+s3);
			
		}
		@Test
		public void main() {
			String s="java!selenium!api";
			String[] s1 =s.split("!");
			for(String ab:s1)
			{
			System.out.println(ab);
			
			}
		}
}

