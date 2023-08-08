package practice;

import org.testng.annotations.Test;

public class Reverse {
	@Test
	public void main() {
		String s = "shalivan khandre siddeshwar";
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i >= 0; i--)
		{
			if (i == (s1.length/2)) 
			{
				String b = s1[i];
				String rev = "";
				for (int j = b.length() - 1; j >= 0; j--)
				{
					rev = rev + b.charAt(j);
				}

				System.out.print(rev +" ");
			}

			else {
				System.out.print(s1[i]+" ");
			}
		}

	}
}
