package javaprograms;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<Object>();
		l.add(10);
		l.add("helllo");
		l.add(null);
		l.add(10);
		l.add(20);
		l.addFirst("java");
		l.addLast("bye");
		System.out.println(l);
		System.out.println(l.getFirst());  // get first value
		System.out.println(l.getLast());   // get last value
		System.out.println(l.get(2));
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l.removeLastOccurrence(20));
		LinkedList<Object> l2 = new LinkedList<Object>();
		l2.add(30);
		l2.add(40);
		l2.add("hello");
		l2.add(0);
		l2.add(10);
		l2.add(5);
		l.retainAll(l2);  //show the duplicates present in the l2 w.r.t. l
		System.out.println(l);
		l.removeAll(l2);  // remove the duplicates present in l1 w.r.t l
		System.out.println(l);
		System.out.println(l2);
		l.addAll(l2);
		for(Object obj:l)
		{
			System.out.println(obj);
		}
	}

}
