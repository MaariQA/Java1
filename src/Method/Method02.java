package Method;
import java.util.Scanner ;
public class Method02 {
		static void printTable(int n) {
			for(int i=1;i<=10;i++){
				System.out.print(n*i+" ");
				System.out.println();
			}}
		 	public static void main(String[]args) {
		 		Scanner sc= new Scanner(System.in);
			int i=1;
			while (i<=5) {
				System.out.println("Enter the number");
				int no = sc.nextInt();
				printTable(no);
				i++;
				}
			System.out.println();
		 	sc.close();
		 	}
}
