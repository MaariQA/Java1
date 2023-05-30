// Replace method return a String from replacing all occurrence of old chart
// String in this string if new char / string
package STRING02;
public class ReplaceMethod {
	public static void main(String[] args) {
     String Str = "Yawatmal";
     String S1 =  Str.replace('a','0');
     String S11 =  Str.replace("a","pune");
     System.out.println(S1);
     System.out.println(Str);
     System.out.println(S11);
     
     String S2 = Str.replace("wat","WAT");
     System.out.println(S2);

     String Str1 = "kunyakumari";
     String  S3 = Str1.replace("ku","tu");
     System.out.println(S3);
     String  S5 = Str1.replaceFirst("ku","tu");
     System.out.println(S5);
}
}
