package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(7);
		set.add(2);
		set.add(1);
		set.add(8);
		set.add(9);
      System.out.println(set);
      Set<String> set1 = new TreeSet<>(Arrays.asList("Smriti","Harman","Julan","Dipti","Deepali","Mitali"));	  
      System.out.println(set1);
	}
}
