// RepalceChar
package STRING;
public class StringDemo15 {
	public static void main(String[] args) {
		 String str = "String haaaaandling";
	        char[] chars = str.toCharArray();
	        for (int index = 0; index < chars.length; index++) {
	            if(chars[index]=='a' || chars[index]=='d'){
	                chars[index] = '@';
	            }
	        }
	        for (int index = 0; index < chars.length; index++) {
	            System.out.print(chars[index]);
	        }
	}
}
