// WAP to print prime no user input ?
package forloop;
import java.util.Scanner;
public class PrimerNOUser {
	public static void main(String[]arg) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no");
		int n, cnt=0;
		n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			if (n%i==0) {
				cnt++;
			}
		}
		if(cnt==2)
			System.out.print("prime no");
		else
			System.out.print("not prime no");
	}
   }
