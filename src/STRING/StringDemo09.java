// Split
package STRING;
public class StringDemo09 {
	public static void main(String[] args) {
//		String ph = "My country name is India";
//		String[]phArr = ph.split(" ");
//		System.out.println("length of string array:"+phArr.length);
//		for(String x : phArr)
//		System.out.println(x);
//		
//		System.out.println("".repeat(40));
//		
//		String str = "Rs.5634/-";
//		String[] strArr = str.split(" ");
//		System.out.println(strArr.length);
//		String[]strArr1= strArr [1].split("/");
//		
//		String S1 = strArr1[0];
//		System.out.println("amt:" +S1);
//		System.out.println(Integer.parseInt(S1)+10);
//	}}}

//split method split/divides actual String multiple String an delimiter can Char
//(#, %, $, -, +,or any String is name
//it return String array and then you can manipulate this array as you want divided 
//String are called as token
//integer is wrapper class parents is static method 
//which convert string integer value
		

	String str = "1,abc,pune,2,xyz,mumbai";
	String[] words = str.split(",");

	for (int index = 0; index < words.length; index++) {
		System.out.println(words[index]);
	}}}

		
//		String str1 = "My country name is India";
//        String[] str2 = str1.split(" ");
//    //    String[] str3 = str1.split("\\S");
//        for(String x : str2) {
//        System.out.println(x);
//        }}}

	