package javaprograms;

import java.util.Map.Entry;

public class TreeMap {

	public static void main(String[] args) {
		java.util.TreeMap<Integer,String>	 map = new java.util.TreeMap<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(10, "hello");//duplicate key is not allowed and also it does not allow null keys
		map.put(5, "bye");
		map.put(6, null);
		map.put(8, null);
		map.put(3, "hi");// duplicate vailue is allowed
		System.out.println(map);
		

	}

}
