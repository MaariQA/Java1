// MULII ARRAY
package ARRAY02;
public class ARRAY18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  int[][] arr = {
//	  {},{},{},
//	  System.out.println(arr);  // hash code
//	  System.out.println(arr.length);  // 3
//	  System.out.println(arr[0]);  // hash code
//	  System.out.println(arr[1]);  // hash code
//	  System.out.println(arr[2]);  // hash code
//	  System.out.println(array[0][0]); // Array index out of bound exception 
	  
 int[][] arr2 = {{10},{20,30},{40,50,60}};
 // Array is also called as jagged array
 // Array which contain different size array as its element
 System.out.println(arr2.length);  
 System.out.println(arr2[0].length);  
 System.out.println(arr2[1].length);  
 System.out.println(arr2[2].length); 
 
 // printing multiple array
 System.out.println("***** print-multidimensinal arr*****" );
 for(int i=0;i<arr2.length;i++) {
 for(int j=0;j<arr2[i].length;j++) {
	 System.out.println(arr2[i][j]+" ");
 }
 System.out.println();
  }}}
