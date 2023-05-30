package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ArrayListDemo03 {
	public static void main(String[] args) {

		// Wrapper classes
		/* Byte
		 * Short
		 * Integer
		 * long
		 * Double
		 * Float
		 * character
		 * Boolean
		 */
		List<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(30);
		al.add(null);
		// al.add("Virat");  compile time error
		// al.add("");       compile time error

		System.out.println(al);
		for(Integer x: al)
			System.out.println("--------------");
		for(int i=0; i<al.size(); i++)
			System.out.println(al.get(i));

		System.out.println("-------------------");
		// iterator
		Iterator<Integer> iter = al.iterator();
		while (iter.hasNext());
		System.out.println(iter.next());

		System.out.println("-----Using List Iterator fwd direction-----");
		ListIterator<Integer> Iter = al.listIterator();

		while (Iter.hasNext())
			System.out.println(iter.next());

		System.out.println("-----Using List Iterator bKwd direction-----");
		while (Iter.hasPrevious())
			System.out.println(Iter.hasPrevious());

		System.out.println("-----Using List Iterator bKwd direction-----########-----");
		// blank list
		while (Iter.hasPrevious())
			System.out.println(Iter.hasPrevious());
		System.out.println("----Using list Iterator in between start ----");
		Iterator<Integer>iter1 = al.iterator();

		if(iter1.hasNext())
		{
			iter.next();
			iter.next();
			iter.next();
		}
		while (iter1.hasNext())
			System.out.println(iter1.next());

		// for loop
		System.out.println("-----for loop -----");
		Iterator<Integer>iter2 = al.iterator();
		for(; iter2.hasNext();)
		{
			System.out.println(iter2.next());
		}}}