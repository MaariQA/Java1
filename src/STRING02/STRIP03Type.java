// Java program to demonstrate the usage of // stripLeading() method in comparison to
// other methods
package STRING02;
public class STRIP03Type {
	public static void main(String[] args) {

		// creating a string
		String str = " Hello, World ";

		// print the string without any function
		System.out.println("String is");            // String is
		System.out.println("#" + str + "#");        // # Hello, World #
		System.out.println();                       

		// using strip() method
		System.out.println("Using strip()");           // Using strip()
		System.out.println("#" + str.strip() + "#");  //- #Hello, World#
		System.out.println();

		// using stripLeading() method
		System.out.println("Using stripLeading()");          // Using stripLeading()
		System.out.println("#" + str.stripLeading() + "#");  // #Hello, World #
		System.out.println();

		// using stripTrailing() method
		System.out.println("Using stripTrailing()");            // Using stripTrailing()
		System.out.println("#" + str.stripTrailing() + "#");    //- # Hello, World#
	}
}

