package Array;
public class Array05 {
	public static void main(String[] args) {
  int arr[]= {1,3,5,4,3,5,6};
  int element= 5 ,cnt=0;
  for(int i=0;i<arr.length;i++)
  if(arr[i]== element)
  cnt++ ;
	if(cnt>1)
	System.out.println(element+"Duplicate");
	else {
	System.out.println(element +"is not Duplicate");
	}}}
