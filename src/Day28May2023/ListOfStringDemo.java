package Day28May2023;

import java.util.ArrayList;
import java.util.List;

public class ListOfStringDemo {
 public static void main(String[] args) {
	List<String> al = new ArrayList<>();
	{
		{
		  al.add("Naredra Modi");
		  al.add("Amit Shaha");
		  al.add("Ajit Pawar");
		  al.add("DM Munde");
		}
	};
	System.out.println(al.size());
	System.out.println(al.get(3));
	System.out.println(al.contains("DM Munde"));
			
			System.out.println("Dm Munde".toUpperCase());
 }
}