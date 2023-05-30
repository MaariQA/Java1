// empty
package STRING02;
public class Empty {
	public static void main(String[] args) {
		String name = "Mayur";
		System.out.println(name.length());	       // integer value return // 5 

		System.out.println(name.isEmpty());	       // boolean  value return // false		
		String	str1 = " ";
		System.out.println("isEmpty:" +str1.isEmpty());    // false
		String str2 = "";                     
		System.out.println("isEmpty::" +str2.isEmpty());  // true

	}
}
