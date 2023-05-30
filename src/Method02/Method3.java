// sum
package Method02;
public class Method3 {
	 static int add (int y,int...arr){
  int sum = y;   // sum=0
  for(int x:arr) {
	  sum = sum + x;
  }
	  return sum ;
  }
	public static void main (String[]args) {
	int  res = add (10,20,30,40);
	System.out.println("res = "+res);
	}
	 }