package javaprograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.testng.annotations.Test;

public class RemoveDuplicatesFromArray {
	@Test
	public void removeDuplicates() {
		int[] a = { 4,3,2,3,1 };
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], 1);
			} else {
				Integer j = map.get(a[i]);
		     	j++;
				map.put(a[i], j);
			}

		}
		System.out.println("***********order of occurance************");
		for (Entry a1 : map.entrySet()) {
			System.out.println(a1.getKey() + "    " + a1.getValue());
		}
		System.out.println("***********unique numbers************");
		for (Entry a1 : map.entrySet()) {
			int c = map.get(a1.getKey());
			if (c == 1) {
				System.out.println(a1.getKey() + "   " + a1.getValue());
			}

		}
		System.out.println("**********duplicate numbers*************");
		for (Entry a1 : map.entrySet()) {
			if (map.get(a1.getKey()) > 1) {
				System.out.println(a1.getKey() + "   " + a1.getValue());
			}
		}
		System.out.println("******array with indexing*************");
		 ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]+"  "+(i+1));
		}
		for(int j=0;j<list.size();j++)
		{
			System.out.println(list.get(j)+" "+j);
		}
		
		
	}
}
