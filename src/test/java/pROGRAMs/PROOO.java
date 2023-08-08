package pROGRAMs;

import org.testng.annotations.Test;

public class PROOO {
	@Test
	public void num() {
		int a[]={2,6,4,8,9};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
