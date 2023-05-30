package FullyQualified;

	// import allows your class to access imported class's methods/variable
	// import java.util.Scanner
	// import java.util.*;
	
	import static java.lang.Math.*;
	
	public class MathDemo {


	public static void main(String[] args) {

		// because we have imported all static methods from math class

		System.out.println(abs(-13));
		System.out.println(pow(3, 2));

		// converts - ver no into +ve
		// does not do anything with +ve no

		System.out.println(Math.abs(-12));
		System.out.println(Math.abs(100));
		
		System.out.println(Math.pow(2, 5));
		System.out.println(Math.max(12, 13));
		System.out.println(Math.min(12, 13));
		
		System.out.println(Math.floor(12.8));
		System.out.println(Math.ceil(12.1));
		
		System.out.println(Math.PI);
		System.out.println(Math.random());
	}
}