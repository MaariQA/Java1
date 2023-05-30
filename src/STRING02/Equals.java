// Equals() 
package STRING02;
public class Equals {
	public static void main(String[] args) {
		String S1 = "Sambhaji Nagar";
		String S2 = "Sambhaji Nagar";
		System.out.println("S1.Address"+System.identityHashCode(S1));
		System.out.println("S1.Address"+System.identityHashCode(S2));

		if(S1 == S2)         // reference or memory Address/ hash codes
		System.out.println("S1 == S2");
	else  
		System.out.println("S1 ! = S2");
		
	    if(S1.equals(S2))
		System.out.println("S1 is SAME as a S2 contentwise");
	    else  
		System.out.println("S1 is  not SAME as  a S2 contentwise");
	
	System.out.println("-------------");
		String S3 = new String("Solapur");
		String S4 = new String("Solapur");
		System.out.println("S3.Address " + System.identityHashCode(S3));
		System.out.println("S4.Address " + System.identityHashCode(S4));
		
		if (S3 == S4) {      // reference or memory Address/ hash codes
			System.out.println("S3 == S4");
		} else {
			System.out.println("S3 != S4");
		}
		if (S3.equals(S4)) {
			System.out.println("S3 is SAME as S4 contentwise");
		} else {
			System.out.println("S3 is NOT SAME as S4 contentwise");
		}
	}
}

//This method belongs to the string final class from java.lang package
//When used with string it accept one parameter of type string
//(can be create using literal way or using new operator)
//String str = "Pune"; // create a string is SCP area of heap memory.
//Create a string heap memory and point to a string
//Which was having a string value as pune inside SCP
//When we use S1 == S2(==:comparison operator)
//hear Hash code/ memory/ address/  references are compared and not the actual string content
//When we use S1.equals (S2) hear JAVA use the actual content of S1and S2 index wise and
//return true
//When both 