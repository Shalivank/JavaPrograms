package javaprograms;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(10, "hello");//duplicate key is not allowed
		map.put(5, "bye");
		map.put(3, "hi");// duplicate vailue is allowed
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.contains("bye"));
		System.out.println(map.replace(5, "super"));
		System.out.println(map.get(10));
		System.out.println(map);
		
	}
}
