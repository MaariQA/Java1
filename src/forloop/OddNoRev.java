package forloop;
import java.util.Scanner;
public class OddNoRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter start no");
		int Fno=sc.nextInt();
		System.out.println("Enter end no");
		int Sno= sc.nextInt();
		if(Fno< Sno)
			System.out.println("Invoild no please enter first no grater than second no");
		else {
			for (int i=Fno;i>=Sno; i--) {
				if(i%2==1)
					System.out.println(i);
			}
		}
		System.out.println("End of program");
		sc.close();
	}
	}
