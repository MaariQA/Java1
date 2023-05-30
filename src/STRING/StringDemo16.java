//  ReverseString 
package STRING;
public class StringDemo16 {
	public static void main(String[] args) {
		   String str = "welcome to IT Shaala";
	        char[] chars = str.toCharArray();
	        int left = 0;
	        int right = chars.length-1;

	        while (left<=right){
	            char ch = chars[left];
	            chars[left] = chars[right];
	            chars[right] = ch;
	            left++;
	            right--;
	        }

	        for (int index = 0; index < chars.length; index++) {
	            System.out.print(chars[index]);
	        }}}  

//			 String str = "welcome to IT Shaala",revSter = " ";
//			 for(int i=str.length()-1; i>=0; i--) 
//			 revSter  = revSter +str.charAt(i);
//			 
//			System.out.println("revSter String"+ revSter);
//			System.out.println(str.length ());
//			System.out.println(revSter.toUpperCase());
//		 }}
		
		
		
//		String str = "welcome to IT Shaala",revSter = " ";
//		 for(int i=str.length()-1; i>=0; i--) 
//		 revSter  = revSter +str.charAt(i);
//		 System.out.println(revSter);
//	}}


				 