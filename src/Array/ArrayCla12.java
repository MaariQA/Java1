// WRA to print occurred 
package Array;
public class ArrayCla12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=20,cnt=0;
       int []arr=new int[] {20,22,25,30,25,23,56,25};
       for(int i=0; i<arr.length; i++)
       if (n==arr[i])
       cnt++;
       System.out.println(n+" Has occurred" + cnt + "time");
	}
}