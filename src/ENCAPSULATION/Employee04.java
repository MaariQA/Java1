package ENCAPSULATION;
import java.util.Scanner ;

public class Employee04 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter NO1");
		int NO1= sc.nextInt();
		System.out.println("Enter NO2");
		int NO2= sc.nextInt();
		System.out.println("Add is"+(NO1+NO2));
		System.out.println("Multi is"+(NO1*NO2));
		System.out.println("Divi is"+(NO1%NO2));
		System.out.println("Modu is"+(NO1/NO2));
		sc.close();
	}
}
