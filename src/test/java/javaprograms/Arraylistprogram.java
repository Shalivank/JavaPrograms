package javaprograms;

import java.util.ArrayList;

public class Arraylistprogram {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("10");
		list.add("0020");
		list.add(10);
		list.add("hi");
		list.add("hello");
		System.out.println(list);
		list.add("java");
		System.out.println(list);
		System.out.println(list.remove("10"));
		System.out.println(list);

	}

}
