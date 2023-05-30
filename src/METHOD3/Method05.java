// we can call function within the a function
package METHOD3;
public class Method05 {
	public static void india (){
		System.out.println("I stay in India");
		System.out.println("I am in India");
	}
	public static void uk() {
		System.out.println("I stay in uk");
		System.out.println("I am in uk");	
	}
	public static void usa() {
		System.out.println("I stay in usa");
		System.out.println("I am in usa");	
	}
	public static void france() {
		System.out.println("I stay in france");
		System.out.println("I am in france");	
	}
	public static void main(String[]args) {
		System.out.println(" start of program");
	//	uk (); // france(); // usa();
		india();
		System.out.println(" end of program");
	}}
