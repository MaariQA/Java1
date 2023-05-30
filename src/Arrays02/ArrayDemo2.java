package Arrays02;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5};
		System.out.println("Org array content:");

		for( int x :a)
			System.out.println(x + ",");
		System.out.println("Filled array content:");

		Arrays.fill(a, 100);
		for(int x :a)
			System.out.println(x + ",");

		Emp[] empArr = {new Emp(1, "Virat"),
				        new Emp(2, "Rohit"),
				        new Emp(3, "Hardhik"),
		};

		System.out.println("\n------------");
		Arrays.fill(empArr, new Emp(4, "Miller"));

		for(Emp x: empArr)
			System.out.println(x.getId() + ":" + x.getName());
		System.out.println("=============================");

		int a1[] = new int[] {10,20,30,40,60};
		int a2[] = new int[] {10,20,90,40,50};
		int a3[] = new int[] {10,20,30,40,60};

		System.out.println("First mismatched index: " +
				Arrays.mismatch(a1,a2));                 // 2 index

		System.out.println("First mismatched index: " +
				Arrays.mismatch(a1,a3));                 // -1 index
	}
}
