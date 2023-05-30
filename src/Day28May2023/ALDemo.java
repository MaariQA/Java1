package Day28May2023;

import java. util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ALDemo{
	/*
	 * insertion order is preserved
	 * null is allowed
	 * Duplicates are allowed
	 * index based structure
	 */

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(null);
		al.add(20);     // Duplicate value

		System.out.println(al);
		System.out.println(al.toString());
		System.out.println(al.toString().length());

		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i) + " ");
		System.out.println("\n for each");

		for(Integer x : al)
			System.out.println(x + " ");
		System.out.println("\n Universal iterator : ");
		Iterator <Integer> iter = al.iterator();

		while(iter.hasNext())
			System.out.println(iter.next() + " ");

		System.out.println("\n nList iterator : ");
		ListIterator<Integer> lIter = al.listIterator();
		while(lIter.hasNext())
			System.out.println(lIter.next() + " ");
	}
}