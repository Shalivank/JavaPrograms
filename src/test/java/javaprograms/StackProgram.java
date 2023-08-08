package javaprograms;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		Stack<Object> s = new Stack<Object>();
		s.push(20);
		s.push(10);
		s.push(30);
		s.push(100);
		s.push(40);
		System.out.println(s.pop()); //last out
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());	
		System.out.println(s.pop()); //first out

	}

}
