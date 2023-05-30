// ComapreTo String
package STRING02;
public class CompareToMethod {
	public static void main(String[] args) {
    String s1 = "Chalisgaon";
    String s2 = "Chalisgaon";
    String s3 = "Faltan";
    String s4 = "CHALISGON";
    
    int str = s1.compareTo(s2);            // 0   // A=65 //a=97
    System.out.println("str =" +str);
    
    int str1 = s1.compareTo(s3);          // < 0 -3   // C=67 // F=70
    System.out.println("str1 =" +str1);
    
    int str2 = s1.compareTo(s1);         // > 0 = 3
    System.out.println("str2 =" +str2);
    
    str = s1.compareToIgnoreCase(s4);    // 0
    System.out.println("str =" +str);    // 0
    
    str = s1.compareTo(s4);              // 0
    System.out.println("str =" +str);    // 0
	}
}

//Compare function compare to string char by char lexographically 
//(using it's Uniccode or ASCII value.
//ASCII Char is a subset of Unicode char
//When Unicode text 2 byte in memory and 100 of char support
//JAVA support uniccode char set.it use to support multi language application