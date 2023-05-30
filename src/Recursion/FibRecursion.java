package Recursion;

public class FibRecursion {
	static void fib(int cnt, int a, int b)
	{
		int sum;
		if(cnt == 0)
			return;
		else 
	{
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
			cnt--;
			fib(cnt,a,b);
	}
	}
		
	public static void main(String[] args) {
		int cnt = 5;
		int a=0, b=1;
		fib(cnt, a, b);
	}
}
	
	