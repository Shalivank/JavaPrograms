package javaprograms;

import java.util.SortedSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SortedSetProgram {
	@Test 
	public void Sorted()
	{
		SortedSet<String> sort = new TreeSet<>();
		sort.add("hi");
		sort.add("hello");
		sort.add("hi");
		sort.add("bangalore");
		sort.add("google");
		sort.add("bye");
		sort.add("wipro");
		sort.add("infosys");
//		sort.add(10);
		System.out.println(sort);
		for(Object set:sort)
		{
			System.out.println(set);
			
		}
		System.out.println(sort.first());
		System.out.println(sort.last());
		System.out.println(sort.headSet("wipro"));
		System.out.println(sort.tailSet("infosys"));
		
	}
}
