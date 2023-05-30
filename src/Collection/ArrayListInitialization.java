package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListInitialization {  
	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

		// creating new array list with the help of existing list l1

		List<Integer> l2 = new ArrayList<> (l1);
		System.out.println("l1 : " + l1);
		System.out.println("l2 : " + l2);
		l1.add(6);
		System.out.println("l1 : " + l1);
		System.out.println("l2 : " + l2);

		List<Integer> l3 = Arrays.asList(10,20,30,40,50);
		System.out.println("l3 : " + l3);
		l3.set(0, null);
		System.out.println("l3 : " + l3);
     }
  }