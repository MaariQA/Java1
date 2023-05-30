package Recursion;
// Demonstration of finding of a number without recursion

public class FactorialDemo {
	public static void main(String[] args) {
	
		int no = 5;
		int fact = 1;
		for(int i=1; i<=no; i++)
			fact = fact* i;
		System.out.println("fact : " + fact);
	}
}
