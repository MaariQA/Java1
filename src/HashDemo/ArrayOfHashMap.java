package HashDemo;
// Demonstration of Array of HaasMap

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayOfHashMap {

	public static void main(String[] args) {
		
		// Way#: initialization of map - similar to ArrayList/Set

		HashMap<Integer,String> map1 = new HashMap(){
			{
				put(101, "Virat");
				put(102, " Rohit");
				put(103, "Dhoni");
			}
		};

		// way#2 : initialization of map using Map.of

		HashMap<Integer,String> map2 = new HashMap<>(Map.of(104,"Rishabh", 105,"Sachin)"));

		HashMap<Integer,String> map3 = new HashMap<>(Map.of(106,"Ruturaj"));

		HashMap<Integer,String> map4 = new HashMap<>(Map.of(107 ,"VInod", 108,"Dinesh)"));

		HashMap<Integer,String> map5 = new HashMap<>(Map.of(109,"Sunil", 110 ,"Suray"));

		// create an array of hashmap
		HashMap<Integer, String> [] ahm = new HashMap[5];
		ahm[0] = map1;
		ahm[1] = map2;
		ahm[2] = map3;
		ahm[3] = map4;
		ahm[4] = map5;

		for(int i=0; i< ahm.length; i++)
		{
			Set<Integer> ks = ahm[i].keySet();
			Iterator<Integer> itr = ks.iterator();

			while (itr.hasNext()){
				Integer k = itr.next();
				String v = ahm[i].get(k);
				System.out.println(k + " : " + v);
			}
			System.out.println("----------------");
		}
	}
}