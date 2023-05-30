// Maximum and minimum
package Method;
import java.util.Scanner;
public class Method15 {
	public static void main(String[] args) {

		Scanner Scanner= new Scanner(System.in);
		System.out.println("Enter three number");
		int number1 = Scanner.nextInt();
		int number2 = Scanner.nextInt();
		int number3 = Scanner.nextInt();

		System.out.println("Maximum"+getMinimum(number1,number2,number3));
		System.out.println("Minimum"+getMinimum(number1,number2,number3));
	}
	static int getMaximum(int number1,int number2, int number3) {
		return (number1>number2)&&(number1>number3)? number2:number3;
	}
	static int getMinimum(int number1, int number2, int number3) {
		return (number1 <= number2 && number1 <= number3) 
		       ? number1 : (number2 <= number3) ? number2 : number3;
	}}
	


