package Collection;

import java.util.HashSet;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("Virat");
		set.add("Ram");
		set.add("Maari");
		set.add("Chandu");

		System.out.println(set);
		boolean res = set.remove("Rohit");
		System.out.println("res : " + res);

		res = set.remove("Hardik");
		System.out.println("res : " + res);
	}
    }