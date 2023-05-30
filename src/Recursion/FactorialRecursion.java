package Recursion;

// Demonstration of finding Factorial of a number with recursion

public class FactorialRecursion {
	static int fact(int n)
	{
		int total;
		if (n == 1)
			return 1;
		else
			total = n * fact(n-1);
		
		return total;
	}
	public static void main(String[] args) {
		
		int no = 3;
		System.out.println(fact(no));
	}
}