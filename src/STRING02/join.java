// join method
package STRING02;
import java.util.Arrays;
public class join {
	public static void main(String[] args) {
		String[] words = {"Java", "is", "an", "object-oriented", "programming", "language"};

		// Join the words using a space as delimiter
		String sentence = String.join("", words);
		System.out.println(sentence); 
		// Output: Java is an object-oriented programming language

		// Join the words using a comma as delimiter
		String csv = String.join(",", words);
		System.out.println(csv);  
		// Output: Java,is,an,object-oriented,programming,language

		// Join the words using a hyphen as delimiter
		String hyphenated = String.join("-", words);
		System.out.println(hyphenated);  
		// Output: Java-is-an-object-oriented-programming-language
		
		String[] words1 = {"the","quick", "brown", "fox", "jumps", "over","the","lazy", "dog"};
        // Join the words using a dash as delimiter
        String hyphenated1 = String.join("-", words1);
        System.out.println(hyphenated1);  
        // Output: the-quick-brown-fox-jumps-over-the-lazy-dog

        // Join the words using a space as delimiter and wrap in parentheses
        String parenthesized = String.join(" ", Arrays.asList(words1));
        parenthesized = "(" + parenthesized + ")";

        System.out.println(parenthesized);
        System.out.println("-----------");  
        // Output: (the quick brown fox jumps over the lazy dog)
        
        String str = "I Love India";
        System.out.println(String.join("$","I","Love","India"));
        System.out.println(String.join(" ","I","Love","India"));
        System.out.println(String.join("#","I","Love","India"));
        System.out.println(String.join("+","I","Love","India"));
        System.out.println(String.join("CYBER","I","Love","India"));
    }
	}

//Return join function concanates multiple String with the help of a delimiter join
// join function take at least 3 parameter out of which it's parameter is 'n; delimiter.
// (any char) Ex. '#', '$' '-' '%' and another parameter is strings
// join is static method is belong to the string class

