package Recursion;

// demonstration of finding sum of first n number with recursion
public class AddFirstNumbers01 {
	
	public static void main(String[] args) {
		int no = 5, total = 0;
		for(int i=no;i>=1;i--)
			total = total + i;
		System.out.println("sum : " + total);
	}
}
