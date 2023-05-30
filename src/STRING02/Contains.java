// This function return true if the given parameter string is present. hence it return false.
package STRING02;
public class Contains {
	public static void main(String[] args) {
		String str =  "My Country  name is India";
		boolean res = str.contains ("Country");    // true
		System.out.println("res:"+res);
		System.out.println("res:"+str.contains("India"));     // true
		System.out.println("res:"+str.contains("india"));     // false

		String s =  "My";
		System.out.println("res:" +str.concat(s));
		System.out.println("res:" +str.concat(" "));
	}
}

