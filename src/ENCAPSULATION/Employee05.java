package ENCAPSULATION;
import java.util.Scanner ;
public class Employee05 {
	public static void main(String[] args) {
		// to format: control A,control i
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  first String");
		String str1 = sc.next();
		System.out.println("Enter  second String");
		
		int no2  = sc.nextInt();
		String res = str1 + no2;
		System.out.println("Result String"+res);
		sc.close();
	}
}
