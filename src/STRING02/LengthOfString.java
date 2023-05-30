// Return the length of the String.The Length  no of number  Char present in the length
// Length can be return '0' String does not contain any char(even space or within spaces

package STRING02;
public class LengthOfString {
	public static void main(String[] args) {
// lengthofString		
      String str = "I love java";
      int len = str.length ();
      System.out.println("length String:"+len);
      String str1 = new String ("I Love India");
      len = str1.length();
      System.out.println("Length String="+len);
	}
}
// Index = (0 1 2 3 4 5 6 7 8  9 10 11 
// Str1  =  I   L O V E   I N  D  I  A 
// NOTE  = String index always start with zero '0'