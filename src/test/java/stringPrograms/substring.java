package stringPrograms;

import org.testng.annotations.Test;

public class substring {
	@Test
	public void str()
	{
		String s="bharati";
		for(int i=0;i<s.length()-1;i++)
		{
			System.out.print(s.charAt(i)+""+s.charAt(i+1));
		}
	}

}
