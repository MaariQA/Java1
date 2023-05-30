// WAP to print Area of circle 
package forloop;
import java.util.Scanner ;
public class AreaOfCircle {
	public static void main(String[] args) {
	//Scanner sc=new Scanner (System.in);
	final double PI=3.14,area;
	int r;
	System.out.println("Enter radius of circle`");
	Scanner sc = new Scanner (System.in);
	r=sc.nextInt();
	area =PI*r*r;  // PI=3.14*5*5= 78.5
	System.out.println("Area of circle"+area);
	}
}
