// split
package STRING02;
public class Split {
	public static void main(String[] args) {
		// Custom input string
		String str = "Mandhare@for@mayur@Maari";
		String[] arrOfStr = str.split("@", 2);

		for (String a : arrOfStr)
			System.out.println(a);
		System.out.println("----------");

		int amt = 2000;
		  System.out.println(String.valueOf(amt)+10);
		 }}
	
// split method / divides actual string in the multiple string based an delimiter
// (any char '#' '$' '/' '-' '+' or array string is name)
// it return string array and then you can manipulates this string array 
// As you want.diviede string are called as tokens.
// value of method return string representation of a given parameter of argument of
// type boolean,charArray,double,float,integer,long,object

 