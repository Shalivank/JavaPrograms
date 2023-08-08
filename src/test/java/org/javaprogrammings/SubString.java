package org.javaprogrammings;

public class SubString {	
public static void main(String[] args) {
	String s="abababcd";
	String s1="";
	for (int i = 0; i < s.length(); i++) {
		if (!s1.contains(s.charAt(i)+"")) {
			s1=s1+s.charAt(i);
		}
		else {
			System.out.println(s.charAt(i));
		}
	}
}

}
