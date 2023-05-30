package STRING;
import java.util.Scanner;
public class StringDemo02 {
	public static void main(String[] args) {
		String name = "Maari";
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Name");
		String st = sc.nextLine();              // sc.nextline no use
		System.out.println(st);                // sop.name
		sc.close();
}
}