package Recursion;

// demonstration of finding sum of first n number with recursion

public class AddFirstNumbers {

	static int add (int n) {
		int total;
		if(n == 1)
			return 1;
		else
			total = n + add(n-1);
		return total;
	}
	public static void main(String[] args) {
		int no = 4;
		System.out.println(add(no));
	}
}
