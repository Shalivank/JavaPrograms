package javaprograms;

import java.util.Map.Entry;

import org.checkerframework.checker.units.qual.m;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<Integer, String> map = new java.util.HashMap<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(10, "hello");//duplicate key is not allowed
		map.put(5, "bye");
		map.put(null, "bye");
		map.put(null, "byebye");
		map.put(6, null);
		map.put(8, null);
		map.put(3, "hi");// duplicate vailue is allowed
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("bye"));
		System.out.println(map.replace(5, "super"));
		System.out.println(map.get(10));
		System.out.println(map);
		for(Entry<Integer, String> m:map.entrySet())  
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}

	}

}
