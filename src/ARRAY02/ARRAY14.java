// REVERS CHAR ARRAY
package ARRAY02;
public class ARRAY14 {
	public static void main(String[] args) {
  String name = "welcom to syber sucess" ;
  char[] arr = name.toCharArray();
  
 // char[] arr1= {'c','b','e','r'};
  
  for(int left=0,right=arr.length-1;left<right;left++,right--) {
	  char temp=arr[left];
	  arr[left]=arr[right];
	  arr[right]=temp;
  }
  for(int i=0;i<arr.length; i++) {
	  System.out.print(arr[i]);
  }
	}
}
