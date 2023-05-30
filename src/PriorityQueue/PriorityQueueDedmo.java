package PriorityQueue;

// Demonstration of PriorityQueue data structure from Collection framework

import java.util.PriorityQueue;

public class PriorityQueueDedmo{
	public static void main(String[]args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(10);
		pq.add(10);
		pq.add(60);
		pq.add(30);
		pq.add(20);
		pq.add(50);
		pq.add(40);
		//	pq.add(null);

		// Insertion order not maintained
		// Duplicates are allowed

		System.out.println(pq);
		// poll() retrieves least element from PriorityQueue;

		System.out.println(pq.poll());  // 10
		System.out.println(pq.poll());  // 10
		System.out.println(pq.poll());  // 20
		System.out.println(pq.poll());  // 30
		System.out.println(pq.poll());  // 40
		System.out.println(pq.poll());  // 50
		System.out.println(pq.poll());  // 60

		System.out.println(pq.isEmpty());

		System.out.println(pq.poll());   // null
		pq.add(100);
		pq.add(200);
		pq.add(300);

		System.out.println(pq.remove(pq.poll()));
		System.out.println(pq.remove(pq.poll()));
		System.out.println(pq.remove(pq.poll()));
		System.out.println(pq.remove(pq.poll()));    // No Such Element Exception
	}
}
