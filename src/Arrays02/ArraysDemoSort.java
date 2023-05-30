package Arrays02;

import java.util.Arrays;
import java.util.List;

public class ArraysDemoSort {

	public static void main(String[] args) {

		int a1[] = {50,30,10,20,25,31};
		Arrays.parallelSort(a1);
		
		// parallel sort will have very good performance when we have large
		//numer of elements like 1 million 10 million
		
		System.out.println("Sorted Array : "+ Arrays.toString(a1));

		int a2[] = {50,30,10,20,25,31};
		Arrays.sort(a2);
		System.out.println("Sorted Array : "+ Arrays.toString(a2));

		int a3[] = {50,30,10,20,25,31};
		// Sort fromIndex and to index
		Arrays.sort(a3, 0, 4); // 0,1,2,3 elements are sorted and rest will keep as is
		System.out.println("Sorted Array : "+ Arrays.toString(a3));

		int a4[] = {50,30,10,20,25,31};
		
		List<int[]> al = Arrays.asList(a4);
		System.out.println(al.get(0));
		System.out.println(al.toString());

		for(int i=0; i<al.get(0).length; i++)
			System.out.println(al.get(0)[i]);

		System.out.println("====================");
		for(int x: al.get(0))
			System.out.println(x);

		System.out.println("---------------desc order sorting");

		int b[] = {4,7,3,1};
		for(int i=0; i<b.length; i++)
			b[i] = b [i] * -1;
		Arrays.sort(b);
		for(int x: b)
			System.out.println(x + ",");
		for(int i=0; i<b.length; i++)
			b[i] = b[i] * -1;
		for(int x: b)
			System.out.println(x + ",");
	}
}
