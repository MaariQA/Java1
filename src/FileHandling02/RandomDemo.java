package FileHandling02;
import java.time.LocalDateTime;
import java.sql.Date;
import java. util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random random = new Random();
		for(int i=1; i<=10; i++)
		{
			// int x = random.nextInt(100000000); // 0- 99
			double x = random.nextDouble();

			System.out.println("Cyber_" +x);
		}
		Date d = new Date(0);
		System.out.println(d);
		String dStr = d.toString();
		dStr = dStr.replace(" ","_");
		System.out.println(dStr);
		dStr = dStr.replace(":","_");
		System.out.println("aCyber+" + dStr);

		java.time.LocalDateTime Id = java.time.LocalDateTime.now();
		System.out.println(Id);

		String fn = Id.toString().replace("-","_").replace(":","_").replace(",","_");
				System.out.println("google_"+fn+".txt");

		// google_2023_05_09T10_56_43_1986824200.txt
	}
}
