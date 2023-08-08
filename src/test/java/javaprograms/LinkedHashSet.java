package javaprograms;


import java.util.Iterator;

import org.testng.annotations.Test;

public class LinkedHashSet {
	@Test
	public void program() {
		java.util.LinkedHashSet<Object> set = new java.util.LinkedHashSet<Object>();
		 
		set.add(10);
		set.add("hi");
		set.add("hello");
		set.add("hi");
		set.add(null);
		set.add(null);
		set.add("bye");
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.remove(20));
		System.out.println(set.size());
		if(set.contains("hi"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		for(Object obj:set)
		{
			System.out.println(obj);
		}
		Iterator<Object> i = set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
