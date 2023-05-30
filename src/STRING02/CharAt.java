// It return the char value at the specified Index.
// It take integer index as parent and index range is form '0' to length '-1'
// If the index is greater than the String 
// It return an expectation call String indexoutofBound
package STRING02;
public class CharAt {
	public static void main(String[] args) {
		String str = "Mayur";
		char ch = str.charAt(3);
		System.out.println("Cha="+ch);
		
// How to print a string using CharAt Method ?
		for(int cnt1 = 0; cnt1<str.length(); cnt1++) {
		System.out.println("char "+str.charAt(cnt1)+ " ");
		}	
// How to print a string using CharAt Method reveres ?
        String str2 = "Maari";
		for(int cnt = str2.length()-1;cnt>=0;cnt--) {
			System.out.print(str2.charAt(cnt));
		}}}
		
// A string can contain any type of char such as number,special char 
// 	[A to Z],[a to z],[0 to 9]

	



