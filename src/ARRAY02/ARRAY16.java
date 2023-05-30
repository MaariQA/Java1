// EQUAL ARRAY
package ARRAY02;
public class ARRAY16 {
 public static void main(String[] args) {
     int[] arr1 = {10,20,30,40};
     int[] arr2 = {10,20,30,40};
     System.out.println("arr are equal: " + equalsarr(arr1,arr2));
     System.out.println("arr1 equals(arr2)");
 }
 private static boolean equalsarr(int[]arr1,int[]arr2) {
     if(arr1 == null || arr2 == null) {
         return false;
     }
     if(arr1.length != arr2.length) {
         return false;
     }
     for(int i=0; i<arr1.length;i++) {
         if(arr1[i]!= arr2[i]) {
             return false;
         }
     }
     return true;
 }
}
