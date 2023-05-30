package Day28May2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ForEach {
	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(20);
		System.out.println("Finding out max from s list---->");
		Optional<Integer> o1 = List.of(12,5,4,8,23,97,54,89,32,89,23).stream().max((n1,n2)-> Integer.compare(n1,n2));
		System.out.println(o1.get());

		System.out.println("Finding ourt min from a list--->");
		Optional<Integer> minFromList = List.of(12,5,4,8,23,97,54,89,32,89,23).stream().min((n1,n2)->Integer.compare(n1,n2));
		System.out.println(minFromList.get());
		
		System.out.println("Finding out min from a list ---->");
		List<Integer> emptyList = new ArrayList<>();
		Optional<Integer> minFromList1 = emptyList.stream().min((n1,n2)->Integer.compare(n1,n2));
		
		// System.out.println(minFromList.get());
		// java.util NoSuch Element Exception: No value present when list is empty
		// to avoid this use orElse
		
		System.out.println(minFromList1.orElse(-1)); // better/ best practice
		System.out.println("Find a max even number from a list of integer--->");
		
		// Optional<Integer> ol1 = List.of(3,5,7).stream().filter(e->e%2 == 0).max((n1,n2)->Integer.compare(n1,n2));
		
		
	Optional<Integer> ol1 = List.of(12,3,14,5,7).stream().filter(e->e%2 == 0).max(( n1,n2)->Integer.compare(n1,n2));
	
		System.out.println("ol1.isEmpty() : " + ol1.isEmpty());      //false
		System.out.println("ol1.ispresent() : " + ol1.isPresent());  // true
		System.out.println("ol1.orElse() : " + ol1.orElse(-1));      // 14
		System.out.println("ol1.get() : " + ol1.get());              // 14
}
}