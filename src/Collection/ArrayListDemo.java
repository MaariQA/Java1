package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {

		// ArrayList : data structure which is growable and contains heterogeneous data type
		// all insertion order is preserved
		// - duplicate are allowed
		// - null is allowed
		// top casting

		List al = new ArrayList<>();
		al.add(10);           // Integer
		al.add(true);        // boolean
		al.add("Virat");    // string
		al.add(12.34f);    // float
		al.add(111.2);    // double
		al.add(null);
		al.add(null);    // duplicates are allowed

		int size = al.size();

		System.out.println("al size:" + al.size());
		System.out.println(al.get(6));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(5));
		System.out.println(al.get(1));
		System.out.println(al.get(4));
		System.out.println(al.get(0));
		System.out.println("-----------------");

		for(int i=0; i<al.size();i++)
			System.out.println(al.get(i));
		System.out.println("reverse order AL contains");
		System.out.println("---------------");

		for(int i=al.size()-1; i>=0; i--)
		System.out.println(al.get(i));
		System.out.println("-----------------");

		System.out.println("-----Enhanced for loop-----");
		for(Object x: al)
			System.out.println(x);
	}
}
