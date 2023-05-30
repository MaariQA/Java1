// Both Comparing String Ignoring the case(upper and lower case)
package STRING02;
public class EqualsIgnoreCse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String S1 = "Pune";
  String S2 = "PUNE";
  System.out.println(S1.equals(S2));
  System.out.println(S2.equals(S1));
  
  if(S2.equals(S1)) {
  System.out.println(S2 == S1);
  }
  
  else if(S2.equals(S1)) {
  System.out.println(S1 != S2);
  System.out.println("equalsIgnoreCase-------");
  }

  if(S2.equalsIgnoreCase(S1)) {
  System.out.println("S2 == s1");
  System.out.println("equalsIgnoreCase-------");
	}
}}                                                                                                                                                                                                                                                                                    