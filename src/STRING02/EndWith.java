// EndWith return true if the a given string ends with the 
// specified string mentioned as a parameter.parmeter is case sensitive 
package STRING02;
public class EndWith {
	public static void main(String[] args) {
		String name = "My Country name is india";
		boolean res = name.endsWith("india");         
		System.out.println("res:"+res);               //res: true         
		System.out.println(name.endsWith("a"));       // true
		System.out.println(name.endsWith("ia"));      // true 
		System.out.println(name.endsWith("India"));   //false
		
		String s = "My";
		System.out.println(s);   
		s = "is India".toLowerCase();
		System.out.println(s);
		System.out.println(name.toLowerCase().endsWith(s));   // true 
	}

}

