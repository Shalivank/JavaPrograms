package zoosvatt;

public class JW {
	public static void main(String[] args) {
		String s="aBzBz";
		int count=s.length();
		for(int i=0;i<s.length()-1;i++)
		{
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(i+1);
			if(((ch1>='a'&&ch1<='z')&&(ch2>='A'&&ch2<='Z'))||((ch1>='A'&&ch1<='Z')&&(ch2>='a'&&ch2<='z')))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
