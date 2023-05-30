// circle
package Method;
import java.util.Scanner;
public class Method08 {
  private static boolean isprime(int number) {
	boolean isprime=true;
	for(int i=0; i<=number;i++) {
		if(number % i == 0) {
			return  false;
		}}
	return true;
  }
   private void CriclecircumfevenArea() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the radius of a circle");
	float radius = scanner.nextLong();
	System.out.println("Area of a cricle"+(3.12f*radius*radius));
	System.out.println("Cricale of a area "+2*3.14* radius);
   }}
