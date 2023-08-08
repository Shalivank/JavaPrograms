package stringPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class RemoveDuplicatesInAmArray {
	@Test
	public void orderOfOcuurance() {
		int[] a= {4,3,2,1,3};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!map.containsKey(a[i]))
			{
				map.put(a[i], 1);
			}
			else
			{
				Integer count = map.get(a[i]);
				count++;
				map.put(a[i], count);
			}
			
		}
		System.out.println("order of occurance");
		for(Entry<Integer, Integer> ab:map.entrySet())
		{
			System.out.println(ab.getKey()+"   "+ab.getValue());
		}
		System.out.println("unique numbers");
		for(Entry<Integer, Integer> ab:map.entrySet())
		{
			Integer c = ab.getValue();
			if(c==1) {
			System.out.println(ab.getKey()+"   "+ab.getValue());
		}
		}
		System.out.println("duplicate numbers");
		for(Entry<Integer, Integer> ab1:map.entrySet())
		{
			Integer d= ab1.getValue();
			if(d>1) {
			System.out.println(ab1.getKey()+"   "+ab1.getValue());
		}
		}
		System.out.println("positioning of numbers");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"  "+(i+1));
		}
		System.out.println("unique numbers with positioning");
		  LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		 for(int i=0;i<a.length-1;i++)
		 {
			 set.add(a[i]);
			
		 }
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i)+"   "+(i+1));
		}
		
	}
}
