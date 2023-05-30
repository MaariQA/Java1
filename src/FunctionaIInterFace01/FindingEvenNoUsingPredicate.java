package FunctionaIInterFace01;

import java.util.function.Predicate;

public class FindingEvenNoUsingPredicate {

	// predicate interface accept one parameter and return a boolean
	// value based on the condition evaluated its " test" method.

	public static void main(String[] args) {

		// Find if the no is even or not

		Predicate<Integer> p = no -> no%2 == 0;
		System.out.println("is 100 even?" + p.test(100));

		System.out.println("is 101 even?" + p.test(101));

		// finding string length > 5

		Predicate<String> p1 = str -> str.length() > 5;
		System.out.println(p1.test("ViratKohali")); // true
		System.out.println(p1.test("Dohni"));       // false

		// Cheak if the string length > 5 and email is
		//cyber@123gmail.com

		Predicate<String> p3 = str -> str.length() > 5;              // true
		Predicate<String> p4 = str -> str.equals("cyber@123gmail");  // false

		Predicate<String> p5 = p3.and(p4);
		System.out.println(p5.test("cyber@123gmail"));     // true
		System.out.println(p5.test("cuccess123@gmail"));   // false
	}
}