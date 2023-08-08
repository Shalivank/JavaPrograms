
package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 1st method");
		String S="Welcome";
		String rev="";
		for(int i=S.length()-1; i>=0; i--)
		{
			rev=rev+S.charAt(i);
		}
		
		System.out.println(rev);
	System.out.println(" 2nd method");	
		String s="welcome";
		char[] ss = s.toCharArray();
		int count=0;
		for(char c:ss)
		{
			count++;
		}
		for(int i=count-1; i>=0;i--)
		{
			System.out.println(ss[i]);
		}
	
		System.out.println(" 3rd method");
		String st="welcome";
		char[] str= st.toCharArray();
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
		
		
		System.out.println(" 4th method");
		String a="welcome";
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(" 5th method");
		String aa="welcome";
		StringBuilder sbd = new StringBuilder(aa);
		sbd.reverse();
		System.out.println(sbd);
}
}