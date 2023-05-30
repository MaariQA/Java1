// It return the index within this String of this 1st occurrence char or string.
// If the is not found it return '-1'.
package STRING02;
public class IndexOf06 {
	public static void main(String[] args) {
// FristIndexof		
     String s = "Maari";
     System.out.println(s.indexOf("a"));      // integer value return  // 1 
     System.out.println(s.indexOf("ar"));     // 2
     System.out.println(s.indexOf("k"));      // -1
     System.out.println(s.indexOf("i"));      // 4
     System.out.println(s.indexOf(" "));      // -1
     System.out.println(s.indexOf(""));      // 0
     
 // lastIndexof.    
     // return the index within string of the last occurrence of the special char or string
     //  if no char or string is found then it return -1
     //  last index of text minimum one parameter char string 
     //  maximum two parameter is index integer value
     // last index of search a char or a string from  right side to left side
     System.out.println(s.lastIndexOf("r"));  // 3
     System.out.println(s.lastIndexOf("a"));  // 2
     
// charAt       
// it return the char value at the special index.
// it take integer index as a parameter and index rang the from '0'	to '-1'
// if the index is greater than the string it return an exception all string
// indexofBoundexception            
     System.out.println(s.charAt(4));        // i  
     System.out.println(s.charAt(2));        // a 

// contains     
     System.out.println(s.contains("i"));   //  true   // boolean
     System.out.println(s.contains("k"));   //  false 

// startsWith     
     System.out.println(s.startsWith("M"));   //  true   // boolean
     System.out.println(s.startsWith("m"));   //  false  
     System.out.println(s.startsWith("a"));   //  false  
     
 // endsWith    
     System.out.println(s.endsWith("ri"));    //  true     // boolean
     System.out.println(s.endsWith("r"));     //  false 
     System.out.println(s.endsWith("i"));     //  true  
     System.out.println(s.endsWith("ari"));   //  true  
     
	}}
