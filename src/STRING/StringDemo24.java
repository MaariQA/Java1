// contain
// this function return true if the given parameter string is present
// Hence it return false
package STRING;
public class StringDemo24 {
	public static void main(String[] args) {
				String str = "My country name is India";
		        boolean res = str.contains("India");
		        System.out.println("res:"+res);
		        
		        System.out.println("res:"+str.contains("india"));  // false
		        System.out.println("res"+str.contains("India"));
		        
		        String s = "My";
		        System.out.println("res:"+str.contains(s));
		        System.out.println("res:"+str.contains(" "));
	}}
