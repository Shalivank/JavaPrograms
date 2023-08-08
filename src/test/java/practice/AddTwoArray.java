package practice;

import org.testng.annotations.Test;

public class AddTwoArray {
		@Test
		public void main() {
			int[] a= {1,2,3,3,4,5};
			int[] b= {1,2,3,4};
			int length=a.length;
			if(a.length<b.length)
			{
				length=b.length;
			}
			for(int i=0;i<length;i++)
			{
				try {
					System.out.println(a[i]+b[i]);
				}
				catch(Exception e)
				{
					if(a.length<b.length)
					{
						System.out.println(b[i]);
					}
					else
					{
						System.out.println(a[i]);
					}
				}
			}
		}
		
		@Test
		public void main1() {
			int[] a= {4,5,6,7,8,8,2};
			int[] b= {3,2,4,5,6};
			int length=a.length;
			if(b.length>a.length)
			{
				length=b.length;
			}
			for(int i=0;i<length;i++)
			{
				try
				{
					System.out.println(a[i]+b[i]);
				}
				catch(Exception e)
				{
					if(b.length>a.length) {
						System.out.println(b[i]);
					}
					else
					{
						System.out.println(a[i]);
					}
				}
			}
		}
}
