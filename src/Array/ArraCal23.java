package Array;
public class ArraCal23 {
	public static void main(String[] args) {
 int[] arr= {10,20,30,42};
  int i=0; float sum=0.0f;
  while (i<arr.length) {
  sum = sum+arr[i];
  i++;
	}
	float avgNO = sum /arr.length ;
	 System.out.println("avgNo");
}
}
