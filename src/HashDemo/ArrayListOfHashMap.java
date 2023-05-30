package HashDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListOfHashMap {

	public static void main(String[] args) {

		List<HashMap<Integer,String>> al = new ArrayList<>();

		HashMap<Integer, String> map1 = new HashMap() {
			{

				put(101,"Virat");
				put(102,"Kapil");
				put(103,"Dhoni");
			}
		};
		// way#2 : initialization of map using Map.of

	HashMap<Integer,String> map2 = new HashMap<>(Map.of(104,"Rishabh", 105,"Sachin)"));

	HashMap<Integer,String> map3 = new HashMap<>(Map.of(106,"Ruturaj"));

	HashMap<Integer,String> map4 = new HashMap<>(Map.of(107 ,"VInod", 108,"Dinesh)"));

	HashMap<Integer,String> map5 = new HashMap<>(Map.of(109 ,"VInod", 110,"Dinesh)"));

		al.add(map1);
		al.add(map2);
		al.add(map3);
		al.add(map4);
		al.add(map5);
		System.out.println(al);

		for(int i=0;i<al.size(); i++)
		{
			HashMap<Integer, String> hm = al.get(i) ;
			Set<Integer> ks = hm.keySet();
			Iterator<Integer> itr = ks.iterator();

			while(itr.hasNext())
			{
				Integer k = itr.next();
				String v = hm.get(k);
				System.out.println(k + " : " + v);
			}
			System.out.println("----------------");
		}
	}
}