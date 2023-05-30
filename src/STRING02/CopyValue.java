// copy value 
package STRING02;
public class CopyValue {
	public static void main(String[] args) {
    char[] S1 = {'I', ' ', 'a', 'm', ' ', 'l', 
        		 'e', 'a', 'r', 'n', 'i', 'n', 'g', ' ', 'j', 'a', 'v', 'a'};
     String S2 = String.copyValueOf(S1 ,0, S1.length-3);
     
     System.out.println(S1);                // I am learning java
     System.out.println(S2);               // I am learning
     
     String S3 = String.copyValueOf(S1);  // Copies entire char array
     System.out.println(S3);              // I am learning java
     System.out.println("------------");              

     System.out.println(System.identityHashCode(S1));            
     System.out.println(System.identityHashCode(S2));            
     System.out.println(System.identityHashCode(S3));            
	}
}


