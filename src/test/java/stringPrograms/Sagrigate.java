package stringPrograms;

import org.testng.annotations.Test;

public class Sagrigate {
		@Test
		public void sagrigate() {
			String s="abEwRTY@#$123";
			String uc="";
			String lc="";
			String sp="";
			String no="";
			for(int i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
				if(Character.isUpperCase(ch))
				{
					uc=uc+ch;
				}
				else if(Character.isLowerCase(ch))
				{
					lc=lc+ch;
				}
				else if(Character.isDigit(ch))
				{
					no=no+ch;
				}
				else
				{
					sp=sp+ch;
				}
			}
			System.out.println(uc);
			System.out.println(lc);
			System.out.println(no);
			System.out.println(sp);
		}
}
