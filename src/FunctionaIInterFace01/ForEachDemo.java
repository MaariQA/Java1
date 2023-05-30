package FunctionaIInterFace01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachDemo {
	private static List<Integer> list;

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(20);

		// ---------- print element using forEach

		Stream<Integer> s = al.stream();
		// s.forEach(x -> System.out.println(x +","));
		// s.forEach(x -> System.out.println(x));
		s.forEach (System.out::println);      // method reference

		// java.lang.IllegalStateException: stream has already been operated upon closed
		//  s.forEach(x -> System.out.println(x));

		// ----------------------------------------

		System.out.println("Sorted list ======>");
		al.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println("ASC Sorted list using cpomparator=====>");
		al.stream().sorted((x,y) -> x.compareTo(y)).forEach(x -> System.out.println(x));

		System.out.println("Desc Sorted list using comparator=====>");
		al.stream().sorted((x,y) -> y.compareTo(x)).forEach(x -> System.out.println(x));

		System.out.println("Desc Sorted list using comparator=====>");
		al.stream().sorted((x,y) ->-(x-y)).forEach(x -> System.out.println(x));

		System.out.println("Asc Sorted list using comparator=====>");
		al.stream().sorted((x,y)->x-y).forEach(x -> System.out.println(x));

		// ------filter predicate-----

		System.out.println("print Even nos---------->");
		al.stream().filter(x->x%2 == 1).forEach(x -> System.out.println(x));

		List<String> sal = new ArrayList<>();
		sal.add("Virat");
		sal.add("Arjun");
		sal.add("Dhoni");
		sal.add("Rohit");
		sal.add("Rishabh");
		sal.add("Shikhar");
		sal.add("Dhoni");
		System.out.println("Print names Whos start with R ------->");
		sal.stream().filter(x->x.startsWith("R")).forEach(System.out::println);

		System.out.println("Print names whos name statr with R and length is> 5---->");
		sal.stream().filter(x->x.startsWith("R")).filter(x->x.length()>5).forEach(System.out::println);


		System.out.println("find disting names------>");
		sal.stream().distinct().forEach(x-> System.out.println(x));

		System.out.println("Print names in upper case----->");
		sal.stream().map(x->x.toUpperCase()).forEach(System.out::println);

		System.out.println("Print names in lower case----->");
		sal.stream().map(x->x.toLowerCase()).forEach(System.out::println);

		System.out.println("Print name in sorted distanct order upper case----->");
		sal.stream().map(x->x.toUpperCase()).distinct().sorted().forEach(System.out::println);

		System.out.println("Convert sorted list into an list");
		List<String> l = sal.stream().sorted().collect(Collectors.toList());
		System.out.println("1 =" +1);

		System.out.println("Count total no of Even nos----");
		long cnt = al.stream().filter(x-> x%2 == 0).count();
		System.out.println("even cnt : " + cnt);

		System.out.println("Finding square of every no:------");
		al.stream().map(x->x*x).forEach(x->System.out.println(x));

		System.out.println("Finding squar of every no and sort in a set---->");
		Set <Integer> set = al.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println("set=" + set);

		System.out.println("Finding squar of every no and sort in a ArrayList---->");
		List<Integer> l1 = al.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("l1 =" + l1);

		System.out.println("Repleas character R to Z  and print -------->");
		sal.stream().map(x->x.replace("R", "Z")).forEach(x->System.out.println(x));

		System.out.println("Find a sum of all number from a list of integer ---");
		Integer sum = al.stream().reduce(0,(n1, n2)-> n1+n2);
		System.out.println("sum = " + sum);

		System.out.println("Find  the length of every string------->");
		sal.stream().map(x->x.length()).forEach(System.out::println);

		System.out.println("Find out max from a list------->");
		Optional <Integer>  o1 = List.of(12,5,8,23,54,89,32,89,23).stream().max((n1,n2)->Integer.compare(n1,n2));
		System.out.println(o1.get());

		System.out.println("Finding out min from list---->");
		Optional<Integer> minFromList = List.of(12,5,8,23,54,89,32,89,23).stream().max((n1,n2)->Integer.compare(n1,n2));
		System.out.println(minFromList.get());

		System.out.println("Finding out min from list---->");
		List<Integer> emptyList = new ArrayList<>();
		Optional<Integer> minFromList1 = emptyList.stream().min(( n1,n2)-> Integer.compare(n1,n2));

		//System.out.println(minFromList.get());
		//Java.util.NoSuch ElementException: No value present when list is empty
		// to avoid this or Else

		System.out.println("Finding a max even number from a list of integer---->");
		Optional<Integer> ol1 = List.of(3,5,7).stream().filter(e->e%2 == 0).max((n1,n2)->Integer.compare(n1,n2));

		System.out.println("Finding a max even number from a list of integer---->");
		Optional<Integer> ol11 = List.of(3,5,7).stream().filter(e->e%2 == 0).max((n1,n2)->Integer.compare(n1,n2));

		System.out.println("o11.isEmpty() : " + ol11.isEmpty());
		System.out.println("ol1.ispresent() : " + ol11.isPresent());

		System.out.println("ol1.orElse() : " + ol11.orElse(-1));
	}
}


