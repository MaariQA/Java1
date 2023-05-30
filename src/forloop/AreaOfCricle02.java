package forloop;
import java.util.Scanner ;
public class AreaOfCricle02 {
	public static void main(String[] args) {
		int area;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Radius");
		int r= sc. nextInt();
		double area1 ,area2; 
		area1 =(22/7.0d)*r*r ;
		System.out.println("22/7:"+(22/7.0d));
		System.out.println("Math PI:"+Math.PI);
		area2=Math .PI *r*r;
		System.out.println("Area of cricle:"+ area1+ "::" +area2);
		sc.close ();
	}}
