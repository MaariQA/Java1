// Final a square of a given no by passing no to method / function
// function return square of the given no
package Method;
public class Method11 {
	 static float getsquare(float n) {        // int data type use method res is int value
return (n*n);
	 }
	 public static void main(String[]args) {
		 float sq = getsquare(10);            //  float = int
		 System.out.println("sq"+ sq);
		 sq = getsquare(5);
		 System.out.println("sq"+sq);
		 int no;
		 no=4;
		 sq = getsquare (no);
		 System.out.println(no+"*"+ no +"="+sq);
		 no =9;
	     sq =getsquare(no);
	     System.out.println(no+"*"+no+"="+sq);
	     System.out.println(getsquare(7));
	 }}
		
