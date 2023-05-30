package Inheritance2;

/*
 Demonstration of passing string by reference but because of immutability
 changed string does not return back to the main method
 */

public class StringParameterPassingDemo {

	static void m1(String str1)
	{
		str1 = str1 + " Mumbai";
		System.out.println("str1 = " + str1); // Pune Mumbai
	}
	public static void main(String[] args) {
		
		String str = "Pune";
		m1(str);                             // will be passed by reference
		System.out.println("str = " + str); // Pune
	}
}

