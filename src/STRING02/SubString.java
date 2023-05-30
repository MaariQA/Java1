// SubString method return char from.form index to index'-1'  
// If only one parameter / index is given,substring method.
// prints all the char from that index unit end to the string.
package STRING02;
public class SubString {
	public static void main(String[] args) {
		String str = "My Country name is India";
		String s = str.substring(3,10);
		System.out.println(s);
		System.out.println(str.substring(11,15));
		System.out.println(str.substring(16));
		
		
//        System.out.println(str.substring(-12,10));
//        System.out.println(str.substring(12,-10));
//        System.out.println(str.substring(-12,-10));
        
        System.out.println(str.substring(0));
        System.out.println(str.substring(10,2));
        System.out.println(str.substring(10,10));
	}
}
