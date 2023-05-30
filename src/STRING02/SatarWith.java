// Start with true if the a given string start with the specified String
//mentioned as a parameter is case sensitive
package STRING02;
public class SatarWith {
	public static void main(String[] args) {
		String name = "My Country name is india";
		boolean res = name.startsWith("My");
		System.out.println("res:"+res);                  // true
		System.out.println(name.startsWith("My"));       // true
		System.out.println(name.startsWith("my"));       // false
		System.out.println(name.startsWith("Country"));  // false
		
		String s = "My";
		System.out.println(s);   // true
		s = "My Country".toUpperCase();
		System.out.println(name.toUpperCase().startsWith(s)); // true
		
	}
}
