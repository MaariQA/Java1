// value Of
package STRING02;
public class ValueOf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt = 2000;
		  System.out.println(String.valueOf(amt)+10);
		  double d = 102939939.939;
	      boolean b = true;
	      long l = 1232874;
	      char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };

	      System.out.println("Return Value : " + String.valueOf(d) );
	      System.out.println("Return Value : " + String.valueOf(b) );
	      System.out.println("Return Value : " + String.valueOf(l) );
	      System.out.println("Return Value : " + String.valueOf(arr) );
	   }
	}





//static String valueOf(int num)
//static String valueOf(float num)
//static String valueOf(boolean sta)
//static String valueOf(double num)
//static String valueOf(char[] data, int offset, int count)
//static String valueOf(long num)
//static String valueOf(Object ob)
//static String valueOf(char chars[])
// Returns:  
// It returns string representation of given value
// valueOf(iNum); // Returns the string representation of int iNum.
// String.valueOf(sta); // Returns the string representation of the boolean argument.
// String.valueOf(fNum); // Returns the string representation of the float fnum.
// String.valueOf(data, 0, 15); 
// Returns the string representation of a specific subarray of the chararray argument.
// String.valueOf(data, 0, 5); // Returns the string of charArray 0 to 5
// String.valueOf(data, 7, 9); 
// Returns the string of charArray starting index 7 and total count from 7 is 9