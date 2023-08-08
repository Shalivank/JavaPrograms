package javaprograms;


public class PriorityQueue {

	public static void main(String[] args) {
		java.util.PriorityQueue<Object> l2 = new java.util.PriorityQueue<Object>();
		l2.add(30);
		l2.add(40);
		l2.add(60);
		l2.add(0);
		l2.add(10);
		l2.add(5);
		System.out.println(l2);
		System.out.println(l2.poll());
		System.out.println(l2.peek());
		System.out.println(l2);

	}

}
