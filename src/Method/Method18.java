// votingApp
package Method;
import java.util.Scanner;

public class Method18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int age = sc.nextInt() ;
		System.out.println("Is eligible vote" + isEligible(age));
	}
	private static boolean isEligible(int age) {
		return age>=18? true : false;
	}
}
