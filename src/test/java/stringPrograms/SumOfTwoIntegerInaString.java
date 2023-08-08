package stringPrograms;

import org.testng.annotations.Test;

public class SumOfTwoIntegerInaString {
		@Test
		public void main()
		{
			String s="b21c13";  
			int sum=0;//21
			int tsum=0;//13
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='0' && s.charAt(i)<='9') {
					int n=s.charAt(i)-48;//51-48=3
					tsum=tsum*10+n;//1*10+3=13
				}
				else
				{
					sum=sum+tsum;//0+21=21
					tsum=0;
				}
			}
			sum=sum+tsum;//21+13=34
			System.out.println(sum);
		}
}
