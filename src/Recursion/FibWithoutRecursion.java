package Recursion;

// Demonstration of fibonacci series without using recursion

public class FibWithoutRecursion {

	public static void main(String[] args) {
		int a=0,b=1, sum=0,cnt=5;
		while(cnt>=1)
		{
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
			cnt--;
		}
	}
}
