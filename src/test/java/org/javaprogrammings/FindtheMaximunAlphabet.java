package org.javaprogrammings;

public class FindtheMaximunAlphabet {

	public static String largestCharacter(String str)
	{
		boolean[] uppercase = new boolean[26];
		boolean[] lowercase = new boolean[26];
		
		char[] arr = str.toCharArray();
		
		for(char ch:arr)
		{
			if(Character.isLowerCase(ch)) 
			lowercase[ch-'a']=true;
			if(Character.isUpperCase(ch))
				uppercase[ch-'A']=true;	
		}
		
		for(int i=25;i>=0;i--)
		{
			if(uppercase[i] && lowercase[i])
			{
				return (char)(i+'A')+" ";
			}
			
		}
		return "-1";
	}
	
	public static void main(String[] args) {
		String str="aaBabcDd";
	System.out.println(largestCharacter(str));
	}


}
