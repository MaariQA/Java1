package Collection03;

//Demonstration of LinkedList data structure from collection Framework

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		System.out.println(ll);

		for(Integer x: ll)
			System.out.println(x);
		for(int i=0;i<ll.size(); i++)
			System.out.println(ll.get(i));
		ll.set(1, 200);
		
		System.out.println("updated List: "+ ll);
	}
}
