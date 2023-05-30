// Length,breath, rectangle
package Method;
import java.util.Scanner;
public class Method16 {
	public static void main1(String[] args) {

		Scanner sc = new Scanner (System.in);
		int length;
		int breath ;
	}
	private int length;
	private int breath;
	static void setDemension(int locallength,int localbreath) {
		// Assign local variable value to instance variable.
		int length = locallength;
		int breath = localbreath;
	}
	int getArea() {
		return length * breath;
	}
	public static void main(String[] args) {
		Method16 rectangle = new Method16();
		System.out.println("Enter the length and breath");
		
		Scanner Scanner = new Scanner (System.in);
		int length = Scanner.nextInt();
		int breath = Scanner.nextInt();
		
		setDemension(length, breath);
		System.out.println("Area of rectangle is"+rectangle.getArea());
	}}
