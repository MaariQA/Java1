package Arrays02;
import java.util.Arrays;
public class ArraysDemo1 {

	static void printArray(int[] ar)
	{
		for(int x : ar)
			System.out.print(x + ",");
		System.out.println("\n-----------------");
	}
	public static void main(String[] args) {

		int[] arr = {6,3,5,2,1,3};
		int[] arr1 = Arrays.copyOf(arr, 6);

		System.out.println(arr1);
		printArray(arr1);

		printArray(arr1);

		int[] arr2 = Arrays.copyOf(arr, 3);
		printArray(arr2);

		int[] arr3 = Arrays.copyOf(arr, 10);
		printArray(arr3);

		int[] arr4 = Arrays.copyOfRange(arr, 2, 5);
				printArray(arr4);

		String s= Arrays.toString(arr);
		System.out.println("s => " + s);
		System.out.println("a.length=>" + s.length());

		int[ ] a1 = {10,20,30};
		int[ ] a2 = {10,20,30};
		int[ ] a3 = {10,20,};
		int a4[] = {10,30,20};

		// equals => compares index wise element from both array and return true or false

		boolean res = Arrays.equals(a1, a2);
		System.out.println("res a1==a2: " + res); // true

		res = Arrays.equals(a1, a3);
		System.out.println("res a1==a3:" + res); // false

		res = Arrays.equals(a1, a4);
		System.out.println("res a1==a4:" + res); // false
	}
}

