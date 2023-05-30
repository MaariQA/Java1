package FileHandling;
	// file handling
public class printfDemo {

	public static void main(String[] args) {

	int amt =123;
	System.out.println("amt:"+amt);
	System.out.printf("amt:%7d\n",amt);
	System.out.printf("amt:%-5d\n",amt); // left justified

	System.out.printf("%15s\n","Cyber");
	System.out.printf("%-10s\n","Cyber");
	
	System.out.printf("%7.2f\n",1.5f);
	System.out.printf("%-7.2f\n",1.5f);
	System.out.printf("%2.2f",1.5f); // ignore the conversion specification

	// System -final class
	// out: public static final object of printstream class
	//printf/print/println: method of printstream class

	}
	}

