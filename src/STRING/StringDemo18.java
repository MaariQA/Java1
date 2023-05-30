// IsEmpty / Blank
//return true if the String is empty or contain only withspace else false
// blank
package STRING;
public class StringDemo18 {
	public static void main(String[] args) {
	/*	String str = "a";
		char[] chars = str.toCharArray();
		System.out.println(chars.length==0?"Its empty":"not empty");
	}}  */
		
//		String name = "Mayur";
//		System.out.println(name.length());
//	   int i = name.length();
//	   if(i == 0) {
//		   System.out.println(name.isEmpty());
//	   }else {
//		   System.out.println(name.isEmpty()== true);
//	   }}		
    
	
		String str1 = "";
		System.out.println("isBlank:" +str1.isBlank());
		
		str1 = " ";
		System.out.println("isBlank:" +str1.isBlank());
		
		str1 = "";
		System.out.println("length:"+str1.length ());
		System.out.println("isEmpty:"+str1.isEmpty ());
		
		str1 = " ";
		System.out.println("length:"+str1.length ());
		System.out.println("isEmpty:"+str1.isEmpty ());
	}}

