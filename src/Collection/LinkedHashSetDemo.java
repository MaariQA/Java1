package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
    Set<Integer> set = new LinkedHashSet<>();
    
    set.add(10);
    set.add(1);
    set.add(2);
    set.add(7);
    set.add(9);
    set.add(3);
    System.out.println(set);
	}
}