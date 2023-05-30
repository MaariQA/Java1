//  Contains /StartWith / EndWith
package STRING;
public class StringDemo08 {
	public static void main(String[] args) {
//		String str = "string handling";
//		System.out.println(str.contains("string"));
//		System.out.println(str.indexOf("h"));
//
//		System.out.println("string starts with st: "+str.startsWith("st"));
//		System.out.println("string ends with ing: "+str.endsWith("ing"));
//	}}


		String str = "welcome to IT Shaala";
		char[] chars = str.toCharArray();
		char ch = 'I';
		for (int index = 0; index < chars.length; index++) {
			if(ch==chars[index]){
				System.out.println("character found at index "+index);
			}}}}  