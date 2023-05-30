package ENCAPSULATION;

import java.util.Scanner ;
public class Add2NOuserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter the number");
		int no1 = sc.nextInt();
		System.out.println("Enter the secand number");
		int no2 = sc.nextInt();
		System.out.println("Add of 2 number is"+(no1+no2));
		sc.close();
	}
}
// Control + shift +0 = import all required classes from java package
