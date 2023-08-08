package zoosvatt;

public class India {

	public static void main(String[] args) {
		String s="india";
		for(int i=0; i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
			{
				System.out.println(s.charAt(i));
			}
		}

	}

}
