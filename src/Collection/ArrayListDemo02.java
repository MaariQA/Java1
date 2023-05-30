package Collection;

//import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
public class ArrayListDemo02 {
	public static void main(String[] args) {
		//List<String> playerNames = new ArrayList<>() {
		
			java.util.List<String> playerNames = new java.util.ArrayList<String>(){
			{
				add("Virat");
				add(" Rohit");
				add("Dhoni");
				add("Sachin");
			}
		};
		System.out.println(playerNames.size());
		System.out.println("Playere Name with for each loop===>");
		for(String x : playerNames)
			System.out.println(x);

		System.out.println("Playere Name with university iteator===");
		Iterator<String> iter = playerNames.iterator();
		while (iter.hasNext());
		System.out.println(iter.next());
	}
}
