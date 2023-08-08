package stringPrograms;

public class StringMethods {
	public static void main(String[] args) {
		String s="welcome";
		System.err.println(s.length());
		
		String st="welcome";
		char[] ss = st.toCharArray();
		System.err.println(st.length());
		
		String s01="welcome";
		System.err.println(s01.charAt(1));
		
		String sr="welcome";
		System.out.println(sr.indexOf('o'));
		
		String s1="hi";
		String s2="HELLO";
		String s3="WELCOME";
		System.out.println(s1.concat(s3).concat(s2));
		
		String s4="hi";
		String s5="HELLO";
		String s6="WELCOME";
		String joined=String.join("",s4,s5,s6);
		System.err.println(joined);
		
		String s7="WELCOME";
		System.out.println(s7.contains("LC"));
		
		String s8="WELCOME";
		System.err.println(s8.startsWith("WE"));
		
		String s9="WELCOME";
		System.out.println("ME");
		
		String s10="WELCOME";
		String s11=" ";
//		System.out.println(s11.isBlank());
		
		String s12="WELCOME";
		String s13=" ";
		System.err.println(s12.isEmpty());
		
		String s14="HI HELLO WELCOME";
		System.out.println(s14.trim());
		
		String s15="WELCOME";
		System.out.println(s15.substring(0,4));
		 
		String s16="HI HELLO WELCOME";
		String[] sss = s16.split(" ");
		for(int i=0;i<sss.length;i++)
		{
		System.out.println(sss[i]);
		}
		
		String s17="hi";
		String s18="hi";
		System.out.println(s17.equals(s18));
		
		String s19="HI HELLO WELCOME";
		System.out.println(s19.replace(" ", ""));
		
		String s20="WELCOME";
		System.out.println(s20.toLowerCase());
		
		String s21="welcome";
		System.out.println(s21.toUpperCase());
		
	
	}
}
