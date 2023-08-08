package javaprograms;

import java.util.Vector;

public class VectorProgram {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		v.add(10);
		v.add(20);
		v.add("hi");
		v.add(null);
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.indexOf("hi"));
		v.add(2, "java");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		v.removeAll(v);
		System.out.println(v);
		v.add("hellloooooo");
		System.out.println(v);
	}
}
