// if a user enter no is prime or not using method
package Method;
import java.util.Scanner;
public class Method25 { 
	static boolean isNoprime(int no) {
		int inloop = 0; 
		int r =0;
		boolean result = true;
		for(int div=2; div<no; div++) {
			r = no%div;
			if(r == 0) {
				inloop = 1;
				result = false;
				break ;
			}
		}
		if(inloop == 0)
			result = true;
		return result;
	}
	public static void main(String[]arg) {
		int no;
		System.out.println("Enter the no");
		Scanner sc=new Scanner (System.in);

		no = sc.nextInt();
		boolean res = isNoprime(no);
		if( res == true) 
			System.out.println(no+"is a prime no");
		else {
			System.out.println(no+"is not a prime no");
			sc.close();
		}
	}}

