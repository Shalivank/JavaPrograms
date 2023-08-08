package javaprograms;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class TreeSet {
	@Test
	public void treeset() {
		 java.util.TreeSet<Integer> set = new java.util.TreeSet<Integer>();
		 set.add(10);
		 set.add(20);
		 set.add(50);
		 set.add(60);
		 set.add(30);
		 set.add(40);
		 System.out.println(set);
		 ArrayList<Object> list = new ArrayList<Object>();
		 list.add("hi");
		 list.add("hello");
		 list.add("bye");
		 list.add(10);
		 System.out.println(list);
		 System.out.println(list.get(4));
		 System.out.println(set.first());
	}
}
