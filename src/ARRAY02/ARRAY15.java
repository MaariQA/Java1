// REMOVE ARRAY
package ARRAY02;
public class ARRAY15 {
	public static void main(String[] args) {
  int []arr= {10,20,30,40};
  int elementtobedeleted=10;
  int indexelementtobedeleted = -1;
  // find the index of an element to be deleted
  for(int i=0;i<arr.length;i++) {
  if(arr[i]==elementtobedeleted) {
  indexelementtobedeleted=i;
  break;
	}}
	// swapping of element
	for(int i=0; i<arr.length-1; i++) { 
	arr[i] = arr[i+1];
	}
	arr[arr.length-1]=0 ;
	//print array
	for(int i=0; i<arr.length; i++) 
		System.out.println(arr[i]+" ");
	}}
