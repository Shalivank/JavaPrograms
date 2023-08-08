package pROGRAMs;

import org.testng.annotations.Test;

public class countchar {
	@Test

	public void count() {
		String s = "premiiii";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count = 1;
			for (int j = i+1 ; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;

				}
			}
			if (count == 1) {
				System.out.println(s.charAt(i) + "--->" + count);
			}

		}
		// System.out.println(count);

}
	
	
	@Test
	public void reve()
	{
		String s="bharati bharati garag";
		String[] st = s.split(" ");
		String rev=" ";
		int count=0;
		for(int i=0;i<st.length;i++)
		{
			count=1;
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i]==st[j])
				{
					count++;
					
				}
			}
			//System.out.println(count+" "+st[i]);
			if(count==1) {
				System.out.println(count+st[i]);
			}
		}
		
	}
	@Test
	public void rem()
	{
		String s="bharati";
		char[] s1 = s.toCharArray();
		String s2="";
		for(int i=0;i<=s1.length-1;i++)
		{
			if(!s2.contains(s1[i]+ ""))
				s2=s2+s1[i];
			}
		
		System.out.println(s2);
	}
	
	
	
	
	
	
	
}
