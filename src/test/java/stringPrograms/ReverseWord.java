package stringPrograms;

import org.testng.annotations.Test;

public class ReverseWord {
//	@Test
//	public void reverse() {
//		String s="i love Bangalore";
//		 String[] b = s.split(" ");
//		 String rev="";
//		 for(int i=b.length-1;i>=0;i--)
//		 {
//			 rev=rev+b[i]+"  ";
//		 }
//		 System.out.println(rev);
//	}
//	
//	
//	@Test
//	public void reverse1() {
//		String ss="i love Bangalore";
//		 String[] bs = ss.split(" ");
//		 String rev="";
//		 for(int i=bs.length-1;i>=0;i--)
//		 {
//			System.out.print(bs[i]+"  ");
//		 }
//	}
	
	@Test
	public void reverse2()
	{
		String str="i love bangalore";
		String[] ab = str.split(" ");
		for(int i=0; i<=ab.length-1;i++)
		{
			if(i==(ab.length/2))
			{
				String b=ab[i];
				String rev="";
				for(int j=b.length()-1;j>=0;j--)
				{
					rev=rev+b.charAt(j);
				}
			}
			if(i==(ab.length/2)+1)
			{
				String c=ab[i];
				String abc=" ";
				for(int k=c.length()-1;k>=0;k--)
				{
					abc=abc+c.charAt(k);
				}
			}
		}
		for(int i=0;i<ab.length-1;i++)
		{


		}
	}
	
	@Test
	public void reverse4()
	{
		String str1="i love bangalore";
		String[] abc = str1.split(" ");
		for(int i=0; i<=abc.length-1;i++)
		{
			String s1=abc[i];
			for(int k=s1.length()-1;k>=0;k--)
			{
				System.out.print(s1.charAt(k));
			}
			System.out.print(" ");
		}
	}
	
	@Test
	public void main() {
		String str2="i love bangalore";
		String[] a1 = str2.split(" ");
		String temp=a1[0];
		a1[0]=a1[a1.length-1];
		a1[a1.length-1]=temp;
		for(int i=0; i<a1.length;i++)
		{
			System.out.println(a1[i]+" ");
		}
		
	}
}
