package Arrays;

import java.util.Arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {

		int[] arr1 = {10,20,30,40,50};

		// System.out.println(arr1.toString().length());

		System.out.println(Arrays.toString(arr1));

		int[] arr2 = Arrays.copyOf(arr1, 3);
		System.out.println(arr2.length);
		System.out.println(Arrays.toString(arr2));

		for(int x: arr2)
			System.out.println(x);

		int[] arr3 = Arrays.copyOf(arr1, 5);
		System.out.println(Arrays.toString(arr3));

		int[] arr4 = Arrays.copyOf(arr1, 10);
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr1));

		int[] arr5 = Arrays.copyOfRange(arr1, 1,4);
		System.out.println(Arrays.toString(arr5));
	}
}