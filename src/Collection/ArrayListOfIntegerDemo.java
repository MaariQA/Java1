package Collection;
import java.util.ArrayList;

// Demonstration of sorting of integers using Collection class

import java.util.Collections;
import java.util.List;

public class ArrayListOfIntegerDemo {
	public static void main(String[] args) {

		List<Integer> al= new ArrayList<>(List.of(50,30,20,40,10));
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("Sort List in Asc order: " + al);
		
		Collections.reverse(al);
		System.out.println("Sort List in Desc order: " + al);
	}
}