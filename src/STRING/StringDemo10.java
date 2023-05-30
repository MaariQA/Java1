// CompareTo {
package STRING;
public class StringDemo10 {
	public static void main(String[] args) {
		   String str1 = "A";
	        String str2 = "B";

	     //    str1-str2= 66 - 65;
	        
	        System.out.println(str2.compareTo(str1));   //-1
	        
	        // compareTo returns three possible values : zero, positive and negative
	        // it compares the strings based on encode[ASCII] value
	}
}
